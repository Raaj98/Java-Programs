package FormulaBasedPrograms;
//Area of rectangle
import java.util.*;
public class Prog2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length");
        int l = scan.nextInt();
        System.out.println("enter the breadth");
        int b = scan.nextInt();
        int area = l*b;
        System.out.println("the area of rectangle :" +area);
    }
}
