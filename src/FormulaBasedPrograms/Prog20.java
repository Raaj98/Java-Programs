package FormulaBasedPrograms;
//calculate cgpa percentage
public class Prog20 {
    public static void main(String[] args) {
        int num = 5;
        double sum =0,cgpa;
        double[] m1 = new double[num];
        double[] m2 = new double[num];
        m1[0]=80;
        m1[1]=90;
        m1[2]=55;
        m1[3]=93;
        m1[4]=88;
        for (int i=0;i<num;i++){
            m2[i] = m1[i]/10;
        }
        for (int i=0;i<num;i++){
            sum = sum+m2[i];
        }
        cgpa = sum/num;
        System.out.println("the cgpa is : " + cgpa);
        System.out.println("the percentage is " + cgpa*9.5);
    }
}
