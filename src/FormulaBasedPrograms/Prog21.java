package FormulaBasedPrograms;
//calculate batting average
public class Prog21 {
    public static void main(String[] args) {
        int matches = 100,totalRuns = 1800,innings = 80 , notOut = 1;
        double avg = totalRuns/(innings-notOut);
        System.out.println("batting average : " + avg);
    }
}
