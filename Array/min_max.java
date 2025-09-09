import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=src.nextInt();
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.print(min+" "+max);
    }
}
/*output:
3
57 94 5
5 94
 */