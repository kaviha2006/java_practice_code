import java.util.Scanner;
public class Q24_prime_number {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        boolean prime=true;
        if(n<=1){
            prime=false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime)
        System.out.println("Prime Number");
        else
        System.out.println("Not a Prime Number");
    }
}
/*output:
7
Prime Number

10
Not a Prime Number
 */