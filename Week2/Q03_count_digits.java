import java.util.Scanner;

public class Q03_count_digits {
    public static void main(String[] args){
        int digit,div=1,count=0;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        while(n/div>=10){
            div*=10;
        }
        while(div>0){
            count++;
            digit=n/div;
            n=n%div;
            div/=10;
        }
         System.out.print(count);
    }
}
