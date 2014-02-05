

package com.Julian.Entitys;

import com.Julian.Res.Header;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author julialonso
 */
public class FileMessage extends Message {
    
    private String name;
    private byte[] data;
    
    public FileMessage(Header header, String address, int port, File file) {
        super(header, address, port);
        this.name = file.getName();
        try {
            data = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
        } catch (IOException ex) {/* */}
    }
    
    public String getName() {
        return this.name;
    }
    
    public byte[] getData() {
        return this.data;
    }
    
}
