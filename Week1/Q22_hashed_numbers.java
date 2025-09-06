import java.util.Scanner;
public class Q22_hashed_numbers {
     public static void main(String[] args) {
         Scanner scr=new Scanner(System.in);
         int sum=0,digit;
         int n=scr.nextInt();
         int temp=n;
         while(n>0){
            digit=n%10;
            sum +=digit;
            n=n/10;
         }
         if(temp%sum==0)
         System.out.println("Harshad Number");
         else
         System.out.println("Not Harshad Number");
}
}
/*output:
18
Harshad Number

21
Harshad Number

22
Not Harshad Number
 */