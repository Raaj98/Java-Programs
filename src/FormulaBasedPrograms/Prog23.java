package FormulaBasedPrograms;
//calculate distance between two points
public class Prog23 {
    public static void main(String[] args) {
        int x1=10,x2=20,y1=35,y2=25;
        double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("the distance between two points : " + d);
    }
}
