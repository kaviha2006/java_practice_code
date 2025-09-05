
import java.util.Scanner;

public class Q11_Triangle_Shape {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int side1=scr.nextInt();
        int side2=scr.nextInt();
        int side3=scr.nextInt();
        if(side1==side2 && side2==side3){
            System.out.print("Equilateral Triangle");
        }
        else if(side1!=side2 && side2!=side3 && side3!=side1){
            System.out.print("Scalene Triangle");
        }
        else{
            System.out.print("Isosceles Triangle");
        }
    }
}
/*output:
    18
    18
    18
    Equilateral Triangle

    12
    25
    15
    Scalene Triangle

    52
    52
    323
    Isosceles Triangle
 */