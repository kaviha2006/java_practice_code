
import java.util.Scanner;
import java.util.Arrays;
public class left_rotation {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=src.nextInt();
        }
        int lrec=src.nextInt();
        for(int k=1;k<=lrec;k++){
            int temp=arr[0];
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            arr[size-1]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
/*output:
5
2 4 6 8 10
3
[8, 10, 2, 4, 6]
 */