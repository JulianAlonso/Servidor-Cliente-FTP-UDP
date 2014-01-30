

package com.Julian.Server.Res;

import com.Julian.Server.Entitys.Client;
import java.util.ArrayList;

/**
 *
 * @author julialonso
 */
public class Clients {
    private static ArrayList<Client> clients = new ArrayList<>();
    
    public synchronized static Client getClient(int port) {
        for(Client client: clients) {
            if(client.getPort() == port)
                return client;
        }
        return null;
    }
    
    public synchronized static Client getClient(String address) {
        for(Client client: clients) {
            if(client.getAddress().equals(address)) 
                return client;
        }
        return null;
    }
    
    public synchronized static void addClient(Client client) {
        clients.add(client);
    }
}
