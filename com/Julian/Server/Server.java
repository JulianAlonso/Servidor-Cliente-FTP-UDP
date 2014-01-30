

package com.Julian.Server;

import com.Julian.Server.Configuration.Config;
import com.Julian.Server.Threads.MainThread;
import com.Julian.Server.Utils.Selector;

/**
 *
 * @author julialonso
 */
public class Server {
    
    private static MainThread mainThread;
    
    public static void main(String[] args) {
        mainThread = new MainThread();
        
        onStart();
    }
    
    private static void onStart() {
        Config.setDocumentRoot(Selector.getJFFile());
        mainThread.start();
    }
}
