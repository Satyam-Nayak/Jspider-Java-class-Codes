import java.util.Scanner;


public class partte1 {
    public static void main(String[] args) {
        for(int i = 1; i<=3; i++){
            System.out.println("========inner loop started=======");
            for(int j = 1; j<= 3; j++){
                System.out.println(i+" "+j);

            }
            System.out.println("========inner loop ended=======");
        }
        
    }
}

