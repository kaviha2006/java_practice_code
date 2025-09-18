import java.util.Scanner;

public class Q11_palindrom_num {
    public static void main(String[] args){
        int digit,product=0;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int temp=n;
        while(n>0){
            digit=n%10;
            product=product*10+digit;
            n=n/10;
        }
        if(temp==product)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
/*output:
121
Palindrome

123
Not a Palindrome
 */