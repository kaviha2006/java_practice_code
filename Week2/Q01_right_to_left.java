
import java.util.Scanner;

public class Q01_right_to_left{
    public static void main(String[] args) {
        int digit;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        while(n>0){
            digit=n%10;
            System.out.print(digit+" ");
            n=n/10;
        }
    }
}
/*output:
1234
4 3 2 1 

1001
1 0 0 1
 */