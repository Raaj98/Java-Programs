package BasicPrograms;
//Write a Java program to count the letters, spaces, numbers and other characters of an input string
public class Prog12 {
    public static void main(String[] args) {
        String email = "krraaj@841998. com";
        count(email);
    }
    public static void count(String x){
        char[] chars = x.toCharArray();
        int letter = 0;
        int number = 0;
        int space = 0;
        int otherChat = 0;
        for (int i=0;i<x.length();i++){
            if (Character.isLetter(chars[i])){
                letter++;
            }else if (Character.isDigit(chars[i])){
                number++;
            }else if(Character.isSpaceChar(chars[i])){
                space++;
            }else {
                otherChat++;
            }
        }
        System.out.println("string is :" + x);
        System.out.println("letter :" + letter);
        System.out.println("number is :" + number);
        System.out.println("space is :" + space);
        System.out.println("otherChat is :" + otherChat);
    }
}
