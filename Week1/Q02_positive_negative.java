// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;
public class Q02_positive_negative {
   public static void main(String[]args) {
      Scanner src = new Scanner(System.in);
      System.out.print("enter the value to be checked:");
      int n = src.nextInt();
      if (n > 0) {
         System.out.println("positive");
      } else if (n < 0) {
         System.out.println("negative");
      } else {
         System.out.println("zero");
      }

   }
}
/*output:
    enter the value to be checked:5
    positive

    enter the value to be checked:-3
    negative
    
    enter the value to be checked:0
    zero
 */