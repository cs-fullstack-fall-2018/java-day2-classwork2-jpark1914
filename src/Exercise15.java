import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args){

        counter();
    }

    public static void counter(){
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Give me a number");
        int num = keyboardInput.nextInt();
        int x = 0;
        while(x <= num){
            System.out.println(x);
            x ++;
        }
    }
}
