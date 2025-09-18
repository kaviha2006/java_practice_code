import java.util.Scanner;
public class Q12_strong_num{
    public static void main(String[] args){
        int digit,fact,sum=0;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int temp=n;
        while(n>0){
            digit=n%10;
            fact=1;
                for(int i=1;i<=digit;i++){
                fact*=i;
                }
            sum+=fact;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
        }
}
/*output:
145
Strong Number

23
Not Strong Number
 */