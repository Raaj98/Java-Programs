package FormulaBasedPrograms;
//calculate commission percentage
public class Prog22 {
    public static void main(String[] args) {
        double amount = 10000,commissionPercentage = 20;
        double commission = (commissionPercentage/100)*amount;
        System.out.println("the commission is : " + commission);
    }
}
