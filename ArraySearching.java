import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = { 1,2,3,4,5};
        System.out.println("wellcome to array seraching\n");
        System.out.println("please neter your number that you want to found : ");
        int num = input.nextInt();
        boolean isFound = isFound(myArr , num);
        if(isFound){
            System.out.println("number found");
        } else{
            System.out.println("number not found");
        }
    }
    
    public static boolean isFound( int[] myArr , int num){
        int index = 0;
        while(index<myArr.length){
            if (myArr[index]==num) {
                System.out.println("your number is found....thanks to come here");   
          
    } index++;
}
}
}



        


