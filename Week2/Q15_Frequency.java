import java.util.Scanner;
public class Q15_Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();        
        int f[]=new int[10];       

        while(n>0){
            int d=n%10;             
            f[d]++;                  
            n=n/10;                  
        }

        for(int i=0;i<10;i++){
            if(f[i]>0){
                System.out.print(i+"->"+f[i]+" ");
            }
        }
    }
}
/*output:
112233
1->2 2->2 3->2 

1002003
0->4 1->1 2->1 3->1 
 */