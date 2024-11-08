import java.util.Scanner;

public class Arith {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("pls enter the value of a \n , b \n ,c \n");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    if(a>b && a >c){
        System.out.println("a is greator number");
    } else if( b>a && b>c){
        System.out.println("b is greator number");
    } else {
        System.out.println(" c is greator number");
    }
    }
}
