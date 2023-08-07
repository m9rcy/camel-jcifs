package org.apache.camel.component.jcifs;

import jcifs.CIFSException;
import jcifs.smb.SmbFile;

import java.net.MalformedURLException;

public class TestableSmbFile extends SmbFile {

    public TestableSmbFile(String url) throws MalformedURLException {
        super(url);
    }


    public void delete(String fileName) throws CIFSException {
        this.delete(fileName);
    }
}
