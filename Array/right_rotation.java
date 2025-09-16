import java.util.Arrays;
import java.util.Scanner;

public class right_rotation {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=src.nextInt();
        }
        int lrec=src.nextInt();
        for(int k=1;k<=lrec;k++){
            int temp=arr[size-1];
            for(int i=size-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
        }
         System.out.println(Arrays.toString(arr));
    }
}
/*output:
5
2 4 6 8 10
3
[6, 8, 10, 2, 4]
 */