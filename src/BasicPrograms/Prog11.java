package BasicPrograms;

import java.util.*;

public class Prog11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter num a");
        int a = scan.nextInt();
        System.out.println("enter num b");
        int b = scan.nextInt();
        if (a==b){
            System.out.println(a + "=" + "=" + b);
        }if (a>b){
            System.out.println(a + ">" + b);
        }if (a<b){
            System.out.println(a + "<" + b);
        }if (a>=b){
            System.out.println(a + ">=" + b);
        }if (a<=b){
            System.out.println(a + "<=" + b);
        }else {
            System.out.println("not compared");
        }
    }
}