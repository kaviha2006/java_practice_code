import java.util.Scanner;
public class right_pascal_triangle {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*output:
5
*
**
***
****
*****
****
***
**
*
 */