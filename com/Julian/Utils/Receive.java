

package com.Julian.Utils;

import com.Julian.Entitys.Message;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author julialonso
 */
public class Receive {
    
      
    public static Object receive(int port) {

        DatagramSocket socket;
        DatagramPacket paquete = null;
        byte recibidos[] = new byte[20000];

        try {
            socket = new DatagramSocket(port);
            
            paquete = new DatagramPacket(recibidos, recibidos.length);
            
            socket.receive(paquete);
            
            socket.close();
        } catch (SocketException ex) {
            System.out.println("Error al asignar el socket");
        } catch (IOException ex) {
            System.out.println("Error en la recepción del paquete");
        }
        
        return unserialize(paquete);
    }

    public static Object unserialize(DatagramPacket paquete) {

        ByteArrayInputStream bytesDelPaquete = new ByteArrayInputStream(paquete.getData()); // bytes es el byte[]
        
        try {
            //La clase ObjectInputStream recupera objetos en su forma original
            ObjectInputStream is = new ObjectInputStream(bytesDelPaquete);
            Object objetoAuxiliar = (Object) is.readObject();
            is.close();
            return objetoAuxiliar;
        } catch (IOException ex) {
            System.out.println("Error al extraer datos del paquete");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al convertir a Mensaje");
        }
        
        return null;
    }
}
