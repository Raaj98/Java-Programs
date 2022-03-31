package BasicPrograms;
//Write a Java program to count the number of even and odd elements in a given array
import java.util.Arrays;
public class Prog22 {
    public static void main(String[] args) {
        int[] num = {1,10,22,23,28,44,55,60};
        int oddCount = 0 , evenCount = 0 ;
        for (int i=0;i<num.length;i++){
            if (num[i]%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("the given array :" + Arrays.toString(num));
        System.out.println("the number of evenNumbers are :" + evenCount);
        System.out.println("the number of oddNumbers are :" + oddCount);
    }
}
