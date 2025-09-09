import java.util.Scanner;

public class array_reverse {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=src.nextInt();
        }
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
/*output:
3
11 12 13
13 12 11 
 */