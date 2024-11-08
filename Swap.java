import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the value of A: ");
        int a = input.nextInt();
        System.out.println("enter the value of B : ");
        int b = input.nextInt();
        
        int c = a;
        a=b;
        b = c;
        System.out.println(" after swapping the value of A  is : " + a );
        System.out.println(" after swapping the value of B  is : " + b );
    }
}