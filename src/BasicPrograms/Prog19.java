package BasicPrograms;
//Write a Java program to convert seconds to hour, minute and seconds
import java.util.*;
public class Prog19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the seconds");
        int seconds = scan.nextInt();
        int h = 0 , m = 0 , s = 0;
        if (seconds>=60){
            m = seconds/60;
            s = seconds%60;
        }
        if (m>=60){
            h = m/60;
        }
        System.out.println(h + "h" + m + "m" + s + "s");
    }
}
