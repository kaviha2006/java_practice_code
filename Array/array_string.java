// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Arrays;
import java.util.Scanner;

public class array_string {
   public static void main(String[] var0) {
      Scanner src = new Scanner(System.in);
      int size = src.nextInt();
      int arr[] = new int[size];

      for(int i = 0; i < size; i++) {
         arr[i] = src.nextInt();
      }

      System.out.print(Arrays.toString(arr));
   }
}
/*output:
3
12 13 14
[12, 13, 14]
 */
