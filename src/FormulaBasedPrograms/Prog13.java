package FormulaBasedPrograms;
//surface area of cylinder
import java.util.Scanner;
public class Prog13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter radius");
        double r = scan.nextDouble();
        System.out.println("enter height");
        double h = scan.nextDouble();
        double surfaceArea = ((2*22*r)/7)*(r+h);
        System.out.println("surfaceArea of cylinder :"+ surfaceArea);
    }
}
