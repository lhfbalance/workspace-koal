/**
 * Copyright(C) 2016,2026,LHF,Inc
 */
package dom4jCreateFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;

/**
 * @author LouHF
 *
 */
public class XML2Byte {
  
  public byte[] File2ByteArray(File file) throws Exception {
    byte[] bs = {2,2};
    FileInputStream fileInputStream = new FileInputStream(file);
    InputStreamReader iReader = new InputStreamReader(fileInputStream);
    BufferedReader bReader = new BufferedReader(iReader);
    byte[] buf = new byte[fileInputStream.available()];
    fileInputStream.read(buf);
    System.out.println(buf.length);
    
    String string = new String(buf);
    System.out.println(string);
    
    while(true) {
      String body = bReader.readLine();
      
      if(body == null) {
        break;
      }
      //System.out.println(body);
    }
    
    //BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
    //BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new ByteArrayOutputStream());
    ByteArrayOutputStream byteout = new ByteArrayOutputStream();
    //byteout.toByteArray();
    return bs;
  }
  
  public static void main(String[] args) throws Exception {
    XML2Byte x = new XML2Byte();
    x.File2ByteArray(new File("ticket.xml"));
  }

}
