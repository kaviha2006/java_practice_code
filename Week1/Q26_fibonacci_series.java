import java.util.Scanner;
public class Q26_fibonacci_series {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int a=0,b=1;
        if(n>=1)System.out.print(a);
        if(n>=2)System.out.print(b);
        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.print(c);
            a=b;
            b=c;
        }
    }
}
/*output:
7
0112358

15
01123581321345589144233377
 */