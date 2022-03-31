package FormulaBasedPrograms;
//surface area of cuboid
import java.util.*;
public class Prog12 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the length");
       int l = scan.nextInt();
       System.out.println("enter the breadth");
       int b = scan.nextInt();
       System.out.println("enter the height");
       int h = scan.nextInt();
       int surfaceArea = 2*((l*b)+(b*h)+(h*l));
       System.out.println("surfaceArea of cuboid :" + surfaceArea);
    }
}
