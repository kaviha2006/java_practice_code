import java.util.Scanner;
public class Q23_perfect_number {
     public static void main(String[] args) {
         Scanner scr=new Scanner(System.in);
         int sum=0;
         int n=scr.nextInt();
         for(int i=1;i<n;i++){
            if(n%i==0){
                sum +=i;
            }
        }
         if(n==sum)
         System.out.println("Perfect Number");
         else
         System.out.println("Not Perfect Number");

}
}
/*output:
6
Perfect Number

12
Not Perfect Number
 */