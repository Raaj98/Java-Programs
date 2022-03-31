package FormulaBasedPrograms;
//sum of n numbers
import java.util.*;
public class Prog17 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter how numbers you sum");
        int n = scan.nextInt();
        int arr[] =new int[n];
        for (int i=0;i<n;i++){
            System.out.println("enter the number " + (i+1)); //i is iterate
            arr[i] = scan.nextInt();
        }
        for (int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of " +n+ " numbers is " + sum);
    }
}
