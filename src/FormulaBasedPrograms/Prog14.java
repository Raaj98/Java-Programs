package FormulaBasedPrograms;
//surface area of cube
import java.util.*;
public class Prog14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter side a");
        double a = scan.nextDouble();
        double surfaceArea = 6*a*a;
        System.out.println("surface area of cube :" + surfaceArea);
    }
}
