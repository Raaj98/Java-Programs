package FormulaBasedPrograms;
//volume of cylinder
import java.util.*;
public class Prog9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the radius");
        int r = scan.nextInt();
        System.out.println("enter the height");
        int h = scan.nextInt();
        int volume = (22/7)*(r*r)*(h);
        System.out.println("volume of cylinder :" + volume);
    }
}
