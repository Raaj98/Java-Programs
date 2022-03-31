package FormulaBasedPrograms;
//volume of cuboid
import java.util.*;
public class Prog10 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the length");
        int l = scan.nextInt();
        System.out.println("enter the height");
        int h = scan.nextInt();
        System.out.println("enter the base");
        int b = scan.nextInt();
        int volume = l*b*h;
        System.out.println("volume of cuboid :"+volume);
    }
}
