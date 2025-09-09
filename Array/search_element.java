import java.util.Scanner;

public class search_element {
    public static void main(String[] args) {
        int i;
        boolean found=false;
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int arr[]=new int[size];
        for(i=0;i<size;i++){
            arr[i]=src.nextInt();
        }
        System.out.print("enter the value to be searched:");
        int n=src.nextInt();
        for(i=0;i<size;i++){
            if(n==arr[i]){
                found=true;
                break;
            }
        }
        if(found)
        System.out.print(i);
        else
        System.out.print("-1");
    }
}
/*output:
3
9 17 10
enter the value to be searched:17
1

3
9 17 10
enter the value to be searched:20
-1
 */