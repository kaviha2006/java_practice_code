import java.util.Scanner;
public class Q16_Sum_of_Even_and_Odd{
    public static void main(String[] args) {
        int evensum=0,oddsum=0;
        Scanner src=new Scanner(System.in);
        int j=src.nextInt();
        for(int n=1;n<=j;n++){
            if(n%2==0){
                evensum+=n;
            }
            else
            oddsum+=n;
                }
        System.out.print(""+oddsum+" "+evensum);
    }
}
/*output:
    10
    25 30

    15
    64 56
 */