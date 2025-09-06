import java.util.Scanner;
public class Q21_sum_of_digits {
     public static void main(String[] args) {
         Scanner scr=new Scanner(System.in);
         int sum=0,digit;
         int n=scr.nextInt();
         while(n>0){
            digit=n%10;
            sum +=digit;
            n=n/10;
         }
         System.out.print(sum);
}
}
/*output:
123
6

405
9
 */