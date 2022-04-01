package ConditionalPrograms;
//given year is leap year or not
import java.util.*;
public class Prog5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the year");
        int year = scan.nextInt();
        if ( (year%400==0) || (year%4==0) && (year%100!=0) ){
            System.out.println("the year is leap year");
        }else {
            System.out.println("the year is not leap year");
        }
    }
}
