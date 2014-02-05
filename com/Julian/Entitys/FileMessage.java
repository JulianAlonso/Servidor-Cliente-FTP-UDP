

package com.Julian.Entitys;

import com.Julian.Res.Header;
import java.io.File;

/**
 *
 * @author julialonso
 */
public class FileMessage extends Message {
    
    private File file;
    
    public FileMessage(Header header, String address, int port, File file) {
        super(header, address, port);
        this.file = file;
    }
    
    public File getFile() {
        return this.file;
    }
    
}
