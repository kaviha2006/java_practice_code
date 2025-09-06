import java.util.Scanner;
public class Q13_character_type {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        char ch=scr.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            System.out.println("alphabet");
        else if(ch>='0' && ch<='9')
            System.out.println("digit");
        else
            System.out.println("special");
    }
}
/*output:
A
alphabet

7
digit

@
special
 */