import java.util.Scanner;
public class Q18_Occarance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int temp=n,count=0,first=-1,last=-1;
        int digits=0;
        int t=n;
        while(t>0){t/=10;digits++;}
        for(int i=digits;i>=1;i--){
            int pow=1;
            for(int j=1;j<i;j++) pow*=10;
            int digit=(n/pow)%10;
            if(digit==d){
                if(first==-1) first=count+1;
                last=count+1;
            }
            count++;
        }
        System.out.println("First="+first+",Last="+last);
        sc.close();
    }
}
/*output:
153553
5
First=2,Last=5

123212               
2
First=2,Last=6
 */