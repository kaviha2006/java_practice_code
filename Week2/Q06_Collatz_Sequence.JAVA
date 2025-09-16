import java.util.Scanner;
public class Q06_Collatz_Sequence{
    public static void main(String[] args) {
        int digit;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        System.out.print(n);
        while(n!=1){
            if(n%2==0){
                 n=n/2;
                 System.out.print(",");
                System.out.print(n);
            }
            else{
                 n=3*n+1;
                 System.out.print(",");
                System.out.print(n);
            }
        }
    }
}
/*output:
26
26,13,40,20,10,5,16,8,4,2,1

5
5,16,8,4,2,1
 */