package BasicPrograms;
//Write a Java program to swap two variables
public class Prog6 {
    public static void main(String[] args) {
        int a = 10 , b = 20 , t;
        System.out.println("before swapping");
        System.out.println(a + " " + b);
        t = a;
        a = b;
        b = t;
        System.out.println("after swapping");
        System.out.println(a + " " + b);
    }
}
