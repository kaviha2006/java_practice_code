import java.util.Scanner;

public class Q19_sum_of_no_div_by_3_5 {
    public static void main(String[] args) {
         Scanner scr=new Scanner(System.in);
         int sum=0;
         int i=scr.nextInt();
         int j=scr.nextInt();
         for(int n=i;n<=j;n++){
            if(n%3==0||n%5==0){
               sum +=n;
            }
         }
         System.out.print(sum);
}
}
/*output:
1 10
33
 */