
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=src.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*output:
3
11 12 13
11 12 13 

3
11 12 13 14
11 12 13
 */