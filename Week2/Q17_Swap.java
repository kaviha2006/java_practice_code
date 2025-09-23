import java.util.Scanner;
public class Q17_Swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n,d=0;
        while(t>0){t/=10;d++;}
        int p=1;
        for(int i=1;i<d;i++) p*=10;
        int f=n/p,l=n%10,r=l*p+(n%p-l)+f;
        System.out.println(r);
    }
}
/*output:
12345
52341

708
807
 */