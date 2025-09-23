import java.util.Scanner;
public class Q16_GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        System.out.println(a);
    }
}
/*output:
48 18
6

24 36
12
 */