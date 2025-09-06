import java.util.Scanner;
public class name_triangle {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        String n=src.nextLine();
        for(int i=0;i<n.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(n.charAt(j));
            }
            System.out.println();
        }
    }
}
/*output:
kaviha
k
ka
kav
kavi
kavih
kaviha
 */