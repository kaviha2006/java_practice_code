import java.util.Scanner;

public class Q20_sum_of_even_digit {
    public static void main(String[] args){
        int digit,sum=0,add=0;
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();//need to correct
        int temp=n;
        while(n>0){
            digit=n%10;
            sum++;
            if(sum%2!=0){
                add+=digit;
            }
            n=n/10;
        }
            System.out.println(add);
    }
}
