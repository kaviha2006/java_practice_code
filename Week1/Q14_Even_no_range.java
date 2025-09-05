import java.util.Scanner;
public class Q14_Even_no_range {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int i=src.nextInt();
        int j=src.nextInt();
        for(int n=i;n<=j;n++){
            if(n%2==0)
            System.out.print(n+" ");
        }
    }
}
/*output:
    1 10
    2 4 6 8 10 
 */