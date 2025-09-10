import java.util.Scanner;

public class Q02_left_to_right{
    public static void main(String[] args){
        int digit,div=1;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        while(n/div>=10){
            div*=10;
        }
        while(div>0){
            digit=n/div;
            System.out.print(digit+" ");
            n=n%div;
            div/=10;
        }
    }
}
/*output:
1234
1 2 3 4

201
2 0 1
 */