import java.util.Scanner;
public class inverse_left_triangle {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
}
}
/*output:
5
54321
4321
321
21
1
 */