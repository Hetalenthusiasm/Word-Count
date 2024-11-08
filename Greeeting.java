import java.util.Scanner;

public class Greeeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please neter your name: ");
        String name = input.nextLine();
        System.out.println("good morning from  java learning to you " + name);
        System.out.println( name + " please tell me your age:");
        int age = input.nextInt();
        System.out.println("your age is :" + age); 
    }
}
