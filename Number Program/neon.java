import java.util.Scanner;
public class neon {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int square=n*n;
        int sum=0;
        while(square>0){
            sum +=square%10;
            square /=10;
        }
        if(n==sum){
            System.out.println("neon number");
        }
        else{
            System.out.println("not a neon number");
        }
    }
}
/*output:
9
neon number

10
not a neon number
 */