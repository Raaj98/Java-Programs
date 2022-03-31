package FormulaBasedPrograms;
//Volume of prism
import java.util.*;
public class Prog7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the base");
        int b = scan.nextInt();
        System.out.println("enter the height");
        int h = scan.nextInt();
        int volume = b*h;
        System.out.println("volume of prism :" + volume);
    }
}
