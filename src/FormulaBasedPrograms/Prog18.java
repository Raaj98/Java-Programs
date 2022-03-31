package FormulaBasedPrograms;
//factorial of given number
public class Prog18 {
    public static void main(String[] args) {
        int n = 5, fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("the factorial of given number is " + fact);
    }
}
