import java.util.Scanner;

public class Q14_center_digit {
    public static void main(String[] args){
        int digit,sum=0;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int temp=n;
        while(n>0){
            digit=n%10;
            sum++;
            n=n/10;
        }
        if(sum%2!=0){
            int i;
            i=(sum/2)+1;
            System.out.println(i);}
        else
            System.out.println(-1);
    }
}
/*output:
12345
3

12
-1
 */