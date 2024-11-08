import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to ternary opertator\n");
        System.out.println("pls enter your first number : ");
        int a = input.nextInt();
        System.out.println("pls enter your second number: ");
        int b = input.nextInt();

        int grator = a>b?a:b;
        System.out.println(grator + "is the greator number");
    }
}
