package SimpleStatistics;

import java.util.Scanner;

public class SimpleStatistics {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1 = scnr.nextInt();
      int num2 = scnr.nextInt();
      int num3 = scnr.nextInt();
      int num4 = scnr.nextInt();
      
      double product = num1 * num2 * num3 * num4;
      double average = (num1 + num2 + num3 + num4) / 4;
      
      System.out.println(product);
      System.out.println(average);

      scnr.close();
   }
}
