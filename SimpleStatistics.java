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
      double average = (num1 + num2 + num3 + num4) / 4.0;
      
      System.out.println(product);
      System.out.println(average);

      double averageFloat = (double) num1 * num2 * num3 * num4;
      double productFloat = (double)(num1 + num2 + num3 + num4) / 4;

      System.out.printf("%.0f %.0f", product, average);
      System.out.println();
      System.out.printf("%.3f", averageFloat);
      System.out.print(" ");
      System.out.printf("%.3f", productFloat);
      System.out.println();
      
      scnr.close();
   }
}
