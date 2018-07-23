public class Exercise13 {

    public static void main(String[] args){
        count();

    }

    public static void count(){
        int x = 0;
        while(x < 3){
            for(int i = 0; i <= 5; i ++){
                System.out.print(i);
            }
            x ++;
            System.out.println(x);
        }
    }
}
