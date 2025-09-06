import java.util.Scanner;
public class Q25_perfect_square {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int root=(int)Math.sqrt(n);   // take integer part of sqrt
        if(root*root==n)
            System.out.println("Perfect Square");
        else
            System.out.println("Not a Perfect Square");
    }
}
/*output:
25
Perfect Square

20
Not a Perfect Square
 */