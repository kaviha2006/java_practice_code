import java.util.Scanner;
public class Q15_Sum_of_Even_Numbers{
    public static void main(String[] args) {
        int sum=0;
        Scanner src=new Scanner(System.in);
        int j=src.nextInt();
        for(int n=1;n<=j;n++){
            if(n%2==0){
                sum+=n;
            }
        }
        System.out.print(sum);
    }
}
/*output:
    10
    30
 */