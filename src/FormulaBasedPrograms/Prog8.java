package FormulaBasedPrograms;
//volume of sphere
import java.util.*;
public class Prog8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the radius");
        int r = scan.nextInt();
        int volume = (22/7)*(4/3)*(r*r*r);
        System.out.println("volume of sphere :" + volume);
    }
}
