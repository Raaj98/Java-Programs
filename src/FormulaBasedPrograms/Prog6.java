package FormulaBasedPrograms;
//Area of parallelogram
import java.util.*;
public class Prog6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the base");
        int b = scan.nextInt();
        System.out.println("enter the height");
        int h = scan.nextInt();
        int area = b*h;
        System.out.println("area of parallelogram :" + area);
    }
}
