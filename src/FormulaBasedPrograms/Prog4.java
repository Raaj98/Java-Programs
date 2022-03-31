package FormulaBasedPrograms;
//Area of equilateral triangle\
import java.util.*;
public class Prog4 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the value a");
       double a = scan.nextInt();
       double area = (Math.sqrt(3)/4)*a*a;
       System.out.println("the area of equilateral triangle :" + area);
    }
}
