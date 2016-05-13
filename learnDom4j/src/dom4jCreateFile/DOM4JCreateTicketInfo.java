package dom4jCreateFile;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class DOM4JCreateTicketInfo {

  public static void main(String[] args) throws Exception {


    Element root = DocumentHelper.createElement("ticketinfo");
    Document document = DocumentHelper.createDocument(root);
    // 根节点没有属性
    root.addAttribute("version", "1");
    // 给根节点添加孩子节点
    root.addElement("signature").addAttribute("oid", "1.2.3.4.5.6").addAttribute("desc",
        "身份票据令牌签名算法");

    Element element1 = root.addElement("userinfo");
    element1.addElement("rsmsid").addText("统一资源编码");
    element1.addElement("dncode").addText("用户证书标识");
    element1.addElement("ip").addText("用户IP地址");
    element1.addElement("enccert").addText("用户加密证书base64编码");
    element1.addElement("sigcert").addText("用户签名证书base64编码");
    element1.addElement("certchain").addText("用户证书链base64编码");

    Element element2 = root.addElement("issueinfo");
    element2.addElement("dncode").addText("颁发者证书标识");
    element2.addElement("ip").addText("颁发者IP地址");
    element2.addElement("cert").addText("颁发者证书base64编码");
    element2.addElement("certchain").addText("票据颁发者证书链base64编码");

    long now = System.currentTimeMillis();
    root.addElement("validfrom").addText(String.valueOf(now));
    root.addElement("validto").addText(String.valueOf(now + 15 * 1000));

    // 把生成的xml文档存放在硬盘上 true代表是否换行
    OutputFormat format = new OutputFormat("    ", true);
    format.setEncoding("UTF-8");// 设置编码格式
    XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("ticketinfo.xml"), format);

    xmlWriter.write(document);
    xmlWriter.close();
    
    

  }

}
