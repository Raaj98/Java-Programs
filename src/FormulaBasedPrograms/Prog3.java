package FormulaBasedPrograms;
//Area of triangle
import java.util.*;
public class Prog3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the breadth");
        int b = scan.nextInt();
        System.out.println("enter the height");
        int h = scan.nextInt();
        int area = (b*h)/2;
        System.out.println("the area of triangle :" + area);
    }
}
