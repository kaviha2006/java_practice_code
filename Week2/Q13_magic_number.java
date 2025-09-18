
import java.util.Scanner;

public class Q13_magic_number {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int sum=0;
        while(n>9){
            sum=0;
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
            n=sum;
        }
        if(n==1)
            System.out.println("Magic Number");
        else
            System.out.println("Not a Magic Number");
    }
}
/*output:
19
Magic Number

123
Not a Magic Number
 */