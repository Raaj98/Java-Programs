package ConditionalPrograms;
//simple calculator
import java.util.*;
public class Prog17 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("enter the numbers : ");
         int a = scan.nextInt();
         int b =scan.nextInt();
         System.out.println("pick the correct operator ( +,-,*,/) ");
         char opr = scan.next().charAt(0);
         double ans =0;
         switch (opr){
             case '+' :
                 ans = a+b;
                 break;
             case '-':
                 ans = a-b;
                 break;
             case '*':
                 ans = a*b;
                 break;
             case '/':
                 ans = a/b;
                 break;
             default:
                 System.out.println("invalid");
         }
         System.out.println(a + " " + opr + " " + b + " = " + ans);
    }
}
