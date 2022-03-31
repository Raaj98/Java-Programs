package FormulaBasedPrograms;
//calculate power of numbers
public class Prog25 {
    public static void main(String[] args) {
        int base = 9,exponent = 5, result = 1;
        while (exponent!=0){
            result = result*base;
            --exponent;
        }
        System.out.println("the power of numbers : " + result);
    }
}
