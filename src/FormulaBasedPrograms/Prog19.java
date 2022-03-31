package FormulaBasedPrograms;
//electricity bill
import java.util.*;
public class Prog19 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("enter the no of units");
         long units = scan.nextLong();
         double billPay = 0;
         if (units<100){
             billPay = units*1.20;
         }else if (units<300){
             billPay = (100*1.20)+(units-100)*2;
         }else if (units>300){
             billPay = (100*1.20)+(200*2)+(units-300)*3;
         }
         System.out.println("The bill amount : " + billPay);
    }
}
