import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args){
        mysteryCounter();


    }

    public static void mysteryCounter(){
       Scanner keyboardIn = new Scanner(System.in);
       System.out.println("Give a low number and then a high number");
       int num1 = keyboardIn.nextInt();
       int num2 = keyboardIn.nextInt();
       while(num1< num2){
           System.out.println(num1);
           num1 ++;
       }

    }
}
