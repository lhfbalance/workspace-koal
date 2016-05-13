/**
 * Copyright(C) 2016,2026,LHF,Inc
 */
package dom4jCreateFile;

/**
 * @author LouHF
 *
 */
public class String2ByteArray {

  /**
   * @param args
   */
  public static void main(String[] args) {
    byte[] byteArray = {1,2,3,4};
    String s = new String(byteArray);
    System.out.println(s);
    byte[] byteArray2 = s.getBytes();
    if (byteArray.length == byteArray2.length) {
      System.out.println("equals");
    }
    
    for (int i = 0; i < byteArray2.length; i++) {
      System.out.println(byteArray2[i]);
    }

  }

}
