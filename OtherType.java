import java.util.Scanner;

public class OtherType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to day cheaker\n");
        System.out.println("pls enter your day in number: ");
        int day = input.nextInt();

        String output = switch(day){
            case 1 - > "monday";
            case 2 - > "tuesday";
            case 3 - > "yhu";
            case 4 - >"ryfgrey";
            case 5  - >"dgfjewh";
            case 6 - >"sgdj";
            case 7 - >"hgdbdh";
            default -> "invalid";
        }
        System.out.println(output);
}
}
