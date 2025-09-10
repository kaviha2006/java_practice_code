import java.util.Scanner;
public class Q05_armstrong_number {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();
        int temp=n,sum=0;
        int digit=0;
        int t=n;
        while(t>0){
            digit++;
            t /=10;
        }
        int arr[]=new int[digit];
        for(int i=digit-1;i>=0;i--){
            arr[i]=temp%10;
            temp /=10;
        }
        for(int i=0;i<digit;i++){
            int a=(int) Math.pow(arr[i],digit);
            sum +=a;
        }
        if (n==sum){
            System.out.println("armstrong number");
        } else{
            System.out.println("not a armstrong number");
        }
    }
}
/*output:
153
armstrong number

143
not a armstrong number
 */