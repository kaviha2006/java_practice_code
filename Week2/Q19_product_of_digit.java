import java.util.Scanner;

public class Q19_product_of_digit {
    public static void main(String[] args){
        int digit,sum=0,product=1;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int temp=n;
        while(n>0){
            digit=n%10;
            product*=digit;
            n=n/10;
        }
            System.out.println(product);
    }
}
/*output:
123
6

405
0
 */