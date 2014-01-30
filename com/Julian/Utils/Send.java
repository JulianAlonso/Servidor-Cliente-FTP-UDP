

package com.Julian.Utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author julialonso
 */
public class Send {
    
    public static void send(Object object, String hostdestino, int puerto) {
        try {
            MulticastSocket socket;
            DatagramPacket paquete;
            //El protocolo IP subyacente permite longitudes de paquetes de más de  2^16 bytes, 
            //que incluye tanto las cabeceras como los mensajes
            byte bytesEnviar[];

            bytesEnviar = serialize(object);
            
            System.out.println(bytesEnviar.length);

            socket = new MulticastSocket();
            paquete = new DatagramPacket(bytesEnviar, bytesEnviar.length, InetAddress.getByName(hostdestino), puerto);
            socket.send(paquete);
            socket.close();
        } catch (SocketException ex) {
            System.out.println("Error al asignar el socket");
        } catch (UnknownHostException ex) {
            System.out.println("Error al crear el paquete");
        } catch (IOException ex) {
            System.out.println("Error en el envío del paquete");
        }

    }

    //Serialización
    public static byte[] serialize(Object object) {      //Flujo de salida en el que escribirá os
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try {
            //La clase ObjectOutputStream permite convertir un objeto en una secuencia de bytes
            //Construimos indicando el buffer de salida
            ObjectOutputStream os = new ObjectOutputStream(bytes);
            os.writeObject(object);
            os.close();
            byte[] bytesEnviar = bytes.toByteArray();
            return bytesEnviar;
        } catch (IOException ex) {
            System.out.println("Error al crear el array de bytes");
        }
        return null;

    }
    
}
