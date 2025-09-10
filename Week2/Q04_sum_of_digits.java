import java.util.Scanner;

public class Q04_sum_of_digits {
    public static void main(String[] args) {
        int digit,sum=0;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
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