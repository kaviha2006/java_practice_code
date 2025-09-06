import java.util.Scanner;
public class Q20_count_digits {
     public static void main(String[] args) {
         Scanner scr=new Scanner(System.in);
         int count=0,i;
         int n=scr.nextInt();
         while(n>0){
            n=n/10;
            count++;
         }
         System.out.print(count);
}
}
/*output:
98765
5
 */