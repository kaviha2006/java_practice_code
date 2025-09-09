import java.util.Scanner;

public class element_less_than_key {
    public static void main(String[] args) {
        int count=0;
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=src.nextInt();
        }
        int n=src.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]<n){
                count++;
            }
        }
        System.out.print(count);
    }
}
/*output:
5
45 59 65 82 96
70
3

5
45 59 65 82 96
30
0
 */