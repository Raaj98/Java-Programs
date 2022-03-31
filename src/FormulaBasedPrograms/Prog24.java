package FormulaBasedPrograms;
//calculate compound interest
public class Prog24 {
    public static void main(String[] args) {
        double a =0,p=1000,r=10,t=0;
        a = p*( ( 1+r/100 ) * ( 1+r/100 ) * ( 1+r/100) );
        System.out.println("the amount is " + a);
        double copInt = a -p ; // ci = p*((1+r)/100)-p
        System.out.println("the compound interest is " + copInt);
    }
}