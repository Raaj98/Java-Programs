package FormulaBasedPrograms;
//Area of circle
import java.util.*;
public class Prog1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the radius");
        int r = scan.nextInt();
        int area = 22*r*r/7;
        System.out.println("the area of circle :" +area);
    }
}
