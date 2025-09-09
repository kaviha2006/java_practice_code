import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int sum=0;
        int size=src.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=src.nextInt();
        }
        for(int i=0;i<size;i++){
            sum +=arr[i];
        }
        System.out.print(sum);
    }
}
/*output:
3
11 12 13
36
 */