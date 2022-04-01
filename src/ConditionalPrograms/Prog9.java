package ConditionalPrograms;
//display the cube of give natural numbers
import java.util.*;
public class Prog9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n = scan.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("the cube of " + i + " is : " + (i*i*i) );
        }
    }
}
