import java.util.Scanner;
public class Q07_harshed_num{
    public static void main(String[] args){
        int digit,sum=0;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int temp=n;
        while(n>0){
            digit=n%10;
            sum+=digit;
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

13
Not Harshad Number
 */