import java.util.Scanner;

public class HousePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // height of roof

        // Step 1: Roof (pyramid)
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Step 2: Body (rectangle)
        for (int i = 1; i <= n - 2; i++) {
            // left wall (3 stars)
            System.out.print("***");
            // spaces in the middle
            for (int j = 1; j <= (2 * n - 1) - 6; j++) {
                System.out.print(" ");
            }
            // right wall (3 stars)
            System.out.println("***");
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
***     ***
***     ***
***     ***
***     ***
 */