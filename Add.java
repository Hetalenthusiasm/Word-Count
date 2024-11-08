import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wellcome to our addition calculator\n");
        System.out.println("please enter your first number :");
        int a = input.nextInt();
        System.out.println("please enter your secong number : ");
        int b = input.nextInt();

        int c = a+b;
        System.out.println("the adddition of two number is :" + c);
    }
}
