// import java.util.Scanner;

// public class MonthSwitch {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("wellcome to maonth mapping\n");
//         System.out.println("pls enter your month in number : ");
//         int monthNum = input.nextInt();
//         String month;
//         String monthName = getMonthName(monthNum);
//         System.out.println("your month name is : " + monthName);
//     }
//     public static String getMonthName(int monthNum){
        
//            switch(monthNum){
//             case 1 :
//             System.out.println("january");
//             break;
//             case 2 :
//             System.out.println("feb");
//             break;
//             case 3 :
//             System.out.println("july");
//             break;
//             case 4 :
//             System.out.println("june");
//             break;
//             case 5 :
//             System.out.println("may");
//             break;
//             default:
//             System.out.println("invalid year");
//             break;


//         }
//         return month;
//     }
// }
import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 12: ");
        int monthNumber = input.nextInt();
        
        String month = getMonthName(monthNumber);
        System.out.println("The month is: " + month);
        
      
    }
    
    public static String getMonthName(int monthNumber) {
        String month;
        
        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid month";
                break;
        }
        
        return month;
    }
}
