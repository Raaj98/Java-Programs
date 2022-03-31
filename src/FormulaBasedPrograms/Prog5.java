package FormulaBasedPrograms;
//Area of rhombus
import java.util.*;
public class Prog5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the diagonal 1 ");
        int d1 = scan.nextInt();
        System.out.println("enter the diagonal 2");
        int d2 = scan.nextInt();
        int area = (d1*d2)/2;
        System.out.println("the area of rhombus :" + area);
    }
}
