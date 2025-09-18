import java.util.Scanner;

public class Q10_reverse_num {
    public static void main(String[] args){
        int digit,sum=0;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int temp=n;
        while(n>0){
            digit=n%10;
            System.out.print(digit);
            n=n/10;
        }
    }
}
/*output:
1234
4321

120
021
 */