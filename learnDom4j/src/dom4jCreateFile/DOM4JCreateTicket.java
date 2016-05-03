/**
 * Copyright(C) 2016,2026,LHF,Inc
 */
package dom4jCreateFile;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * @author LouHF
 *
 */
public class DOM4JCreateTicket {
  public static void main(String[] args) throws Exception {

    Element root = DocumentHelper.createElement("ticket");
    Document document = DocumentHelper.createDocument(root);
    
    root.addElement("ticketinfo").addText("ticketinfo.xml 的base64编码");

    root.addElement("signature").addText("ticketinfo.xml 的签名值的base64编码");
    // 把生成的xml文档存放在硬盘上 true代表是否换行
    OutputFormat format = new OutputFormat("    ", true);
    format.setEncoding("UTF-8");// 设置编码格式
    XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("ticket.xml"), format);

    xmlWriter.write(document);
    xmlWriter.close();
  }


}
