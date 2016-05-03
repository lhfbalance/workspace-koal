/**
 * Copyright(C) 2016,2026,LHF,Inc
 */
package dom4jCreateFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Base64;
import java.util.Base64.Encoder;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/**
 * @author LouHF
 *
 */
public class TestBase64 {

  /**
   * @param args
   * @throws Exception 
   */
  @SuppressWarnings("resource")
  public static void main(String[] args) throws Exception {

    String ss = "131321";
    SAXReader reader = new SAXReader();
    Encoder encoder = Base64.getEncoder();
    
    encoder.encode(ss.getBytes());
    //FileInputStream in = new FileInputStream("ticketinfo.xml");
    Document document = reader.read(new File("ticketinfo.xml"));
  }

}
