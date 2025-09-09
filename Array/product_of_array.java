import java.util.Scanner;

public class product_of_array {
    public static void main(String[] args) {
        int product=1;
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=src.nextInt();
        }
        for(int i=0;i<size;i++){
            product *=arr[i];
        }
        System.out.print(product);
    }
}
/*output:
3
11 12 13
1716
 */