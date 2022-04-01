package ConditionalPrograms;
//Write a Java Program to accept number of week’s day (1-7) and print name of the day
import java.util.*;
public class Prog4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the day");
        int day = scan.nextInt();
          switch (day){
              case 1 :
                  System.out.println("monday");
                  break;
              case 2 :
                  System.out.println("tuesday");
                  break;
              case 3 :
                  System.out.println("wednesday");
                  break;
              case 4 :
                  System.out.println("thursday");
                  break;
              case 5 :
                  System.out.println("friday");
                  break;
              case 6 :
                  System.out.println("saturday");
                  break;
              case 7 :
                  System.out.println("sunday");
                  break;
              default:
                  System.out.println("enter the correct week(1-7)");
          }
    }
}
