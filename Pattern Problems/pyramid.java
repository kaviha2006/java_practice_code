import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++)
            System.out.print(" ");
            for(int col=1;col<=2*row-1;col++)
            System.out.print("*");
            
            System.out.println();

        }
        
    }
    
}
/*output:
6
     *
    ***
   *****
  *******
 *********
***********
 */