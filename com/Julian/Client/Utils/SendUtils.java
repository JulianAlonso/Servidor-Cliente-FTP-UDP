package com.Julian.Client.Utils;

import com.Julian.Client.Configuration.Config;
import com.Julian.Entitys.ElementMessage;
import com.Julian.Entitys.FileMessage;
import com.Julian.Entitys.MoveMessage;
import com.Julian.Entitys.ListMessage;
import com.Julian.Entitys.Message;
import com.Julian.Res.Header;
import java.io.File;

/**
 *
 * @author admin
 */
public class SendUtils {

    /**
     * Envia el mensaje de conexion inicial y recibe el listMessaje con el
     * listmodel del document root
     *
     * @return ListMessage
     */
    public static ListMessage connect() {
        Message connect = new Message(Header.CONECT, Config.CLIENT_ADDRESS, Config.PORT_CLIENT);
        Send.send(connect, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage) Receive.receive(Config.PORT_CLIENT);
    }

    /**
     * Entra en la carpeta seleccionada por el cliente.
     *
     * @param element - String con el nomnbre de la carpeta a moverse.
     * @return ListMessage - incluye el listmodel de la carpeta a la que
     * navegamos
     */
    public static ListMessage moveDownTo(String element) {
        MoveMessage down = new MoveMessage(Header.MOVEDOWN, element, Config.CLIENT_ADDRESS, Config.PORT_CLIENT);
        Send.send(down, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage) Receive.receive(Config.PORT_CLIENT);
    }

    /**
     * Vuelve al directorio padre.
     *
     * @return - ListMessage con el listmodel del directorio padre.
     */
    public static ListMessage moveUp() {
        Message up = new Message(Header.MOVEUP, Config.CLIENT_ADDRESS, Config.PORT_CLIENT);
        Send.send(up, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage) Receive.receive(Config.PORT_CLIENT);
    }

    /**
     * Sube un archivo al servidor.
     *
     * @param file - Archivo a subir
     * @return ListMessage con el listmodel del directorio al que hemos subido
     * el archivo, ya actualizado.
     */
    public static ListMessage uploadFile(File file) {
        FileMessage upload = new FileMessage(Header.UPLOAD, Config.CLIENT_ADDRESS, Config.PORT_CLIENT, file);
        Send.send(upload, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage) Receive.receive(Config.PORT_CLIENT);
    }
    
    /**
     * Descarga el archivo seleccionado.
     * @param element - Nombre del archivo a descargar.
     * @return FileMessage - Con el byte[] de datos del archivo y el nombre de este.
     */
    public static FileMessage downloadFile(String element) {
        ElementMessage download = new ElementMessage(Header.DOWNLOAD, Config.CLIENT_ADDRESS, Config.PORT_CLIENT, element);
        Send.send(download, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (FileMessage) Receive.receive(Config.PORT_CLIENT);
    }

    /**
     * Borra un archivo en el servidor.
     * @param element - String - Nombre del archivo a borrar.
     * @return ListMessage - Tiene el listmodel del directorio que hemos borrado
     * actualizado, es decir, sin el fichero que acabamos de borrar.
     */
    public static ListMessage deleteFile(String element) {
        ElementMessage delete = new ElementMessage(Header.DELETE, Config.CLIENT_ADDRESS, Config.PORT_CLIENT, element);
        Send.send(delete, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage) Receive.receive(Config.PORT_CLIENT);
    }
    
    /**
     * Crea un directorio en el directorio en el que nos encontramos.
     * @param element - Nombre del directorio a crear.
     * @return ListMessage - Mensaje con el listmodel del directorio en el que 
     * nos encontramos actualizado.
     */
    public static ListMessage createDirectory(String element) {
        ElementMessage create = new ElementMessage(Header.CREATE, Config.CLIENT_ADDRESS, Config.PORT_CLIENT, element);
        Send.send(create, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage) Receive.receive(Config.PORT_CLIENT);
    }
}
