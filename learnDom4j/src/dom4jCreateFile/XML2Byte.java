/**
 * Copyright(C) 2016,2026,LHF,Inc
 */
package dom4jCreateFile;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * @author LouHF
 *
 */
public class XML2Byte {
  
  public byte[] File2ByteArray(File file) throws Exception {
    byte[] bs = null;
    FileOutputStream fileOnputStream = new FileOutputStream(file);
    
    BufferedOutputStream byteout = new BufferedOutputStream(fileOnputStream);
    
    //byteout.w
    //byteout.close();
    //fileOnputStream.close();
    return bs;
  }

}
