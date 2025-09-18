import java.util.Scanner;

public class Q08_spy_number {
    public static void main(String[] args){
        int digit,sum=0,product=1;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int temp=n;
        while(n>0){
            digit=n%10;
            sum+=digit;
            product*=digit;
            n=n/10;
        }
        if(sum==product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}
/*output:
1124
Spy Number

124
Not Spy Number
 */