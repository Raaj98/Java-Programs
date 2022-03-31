package FormulaBasedPrograms;

import java.util.Arrays;

//calculate average marks
public class Prog15 {
    public static void main(String[] args) {
        int[] marks = {20,30,50,60,90};
        int average = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("the marks are :" + Arrays.toString(marks));
        System.out.println("the average mark is : " + average);
    }
}
