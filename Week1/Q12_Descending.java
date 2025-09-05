
import java.util.Scanner;

public class Q12_Descending{
    public static void main(String[] args) {
        int temp;
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int c=src.nextInt();
        int d=src.nextInt();
        if(a<b){
            temp=a;
            a=b;
            b=temp;
        }
        if(a<c){
            temp=a;
            a=c;
            c=temp;
        }
        if(a<d){
            temp=a;
            a=d;
            d=temp;
        }
        if(b<c){
            temp=b;
            b=c;
            c=temp;
        }
        if(b<d){
            temp=b;
            b=d;
            d=temp;
        }
        if(c<d){
            temp=c;
            c=d;
            d=temp;
        }
        System.out.println(a + " " + b + " " + c + " " + d);
        }

    }
/*output:
    5 8 2 9
    9 8 5 2
 */
