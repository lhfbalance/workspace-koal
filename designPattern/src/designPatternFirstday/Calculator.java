/**
 * Copyright(C) 2016,2026,LHF,Inc
 */
package designPatternFirstday;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author LouHF
 *
 */
public class Calculator {

  /**
   * @param args
   * @throws IOException 
   */
  public static void main(String[] args) throws IOException {
    double result = 0;
    System.out.println("请输入数字A：");
    Scanner in = new Scanner(System.in);
    String numberA = in.nextLine();
    String numberB = in.nextLine();
    result = Double.valueOf(numberA) + Double.valueOf(numberB);
    System.out.println(String.valueOf(result));
  }

}
