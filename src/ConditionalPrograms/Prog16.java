package ConditionalPrograms;
//Write a Java program that determines a student’s grade
import java.util.*;
public class Prog16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter quiz_score");
        int quiz_score = scan.nextInt();
        System.out.println("enter mid_score");
        int mid_score = scan.nextInt();
        System.out.println("enter final_score");
        int final_score = scan.nextInt();
        double avg = (quiz_score + mid_score + final_score) / 3;
        System.out.println("the average mark is : " + avg);
        if (avg >= 90) {
            System.out.println("the student get A grade");
        } else if ((avg >= 70) && (avg <= 90)) {
            System.out.println("the student get B grade");
        } else if ((avg >= 50) && (avg <= 70)) {
            System.out.println("the student get C grade");
        } else if (avg < 50) {
            System.out.println("the student get d grade");
        } else {
            System.out.println("Fail");
        }
    }
}
