/**
 * Copyright(C) 2016,2026,LHF,Inc
 */
package dom4jCreateFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * @author LouHF
 *
 */
public class TestException {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Element root = DocumentHelper.createElement("ticket");
    Document document = DocumentHelper.createDocument(root);
    
    root.addElement("ticketinfo").addText("ticketinfo.xml 的base64编码");

    root.addElement("signature").addText("ticketinfo.xml 的签名值的base64编码");
    // 把生成的xml文档存放在硬盘上 true代表是否换行
    OutputFormat format = new OutputFormat("    ", true);
    format.setEncoding("UTF-8");// 设置编码格式
    XMLWriter xmlWriter = null;
    try {
      xmlWriter = new XMLWriter(new FileOutputStream("ticket1.xml"), format);
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
    try {
      System.out.println("try catch start running");
      new FileInputStream(new File("ticket2.xml"));
      System.out.println("try catch is running");
    } catch (FileNotFoundException e) {
      System.out.println(e.toString());
    }

    System.out.println("running");
    try {
      xmlWriter.write(document);
    } catch (IOException e) {
      e.printStackTrace();
    }
    try {
      xmlWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
   
  }

}
