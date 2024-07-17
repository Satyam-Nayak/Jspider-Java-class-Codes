public class switch2 {
    public static void main(String[] args) {
        int num = 3;
        // switch never accepts boolean as its value
        switch(num%2){
            case 0 : System.out.println("Even");
            break;
            
            default: System.out.println("odd");

        }
    }
}
