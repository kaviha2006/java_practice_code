import java.util.Scanner;
public class Q18_Digits_Right_to_Left {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
    int temp;
    int a=src.nextInt();
    int b=src.nextInt();
    int c=src.nextInt();
    int d=src.nextInt();
    temp=a;
    a=d;
    d=temp;
    temp=b;
    b=c;
    c=temp;
    System.out.print(a+" "+b+" "+c+" "+d);
    }    
}
/*output:
    1 2 3 4                     
    4 3 2 1
 */