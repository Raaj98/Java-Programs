package FormulaBasedPrograms;
//volume of cone
import java.util.*;
public class Prog11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the radius");
        int r = scan.nextInt();
        System.out.println("enter the height");
        int h = scan.nextInt();
        int volume = (22*r*r*h)/(3*7);
        System.out.println("the volume of cone :" + volume);
    }
}
