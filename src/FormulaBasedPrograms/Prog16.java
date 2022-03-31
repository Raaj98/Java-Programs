package FormulaBasedPrograms;
//check vowel or consonant
import java.util.*;
public class Prog16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = scan.next().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("the character " + ch + " is vowel");
        }else {
            System.out.println("the character " + ch + " is consonant");
        }
    }
}
