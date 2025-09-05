import java.util.Scanner;
public class Q17_factorial{
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int j=src.nextInt();
        if(j < 0){
            System.out.println("Error! Factorial of a negative number doesn't exist.");
        } 
        else{
            long fact=1;
            for(int n = 1; n <= j; n++){
                fact*= n;
            }
            System.out.println(fact);
        }
    }
}
/*output:
    5
    120

    -7
    Error! Factorial of a negative number doesn't exist.
 */