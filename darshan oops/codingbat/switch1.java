public class switch1 {
    public static void main(String[] args) {
        char op = 'A';
        switch(op) {
            case 'A' : System.out.println("90 - 100");
            break;
            case 'B' : System.out.println("75 - 89");
            break;
            case 'C' : System.out.println("60- 75");
            break;
            case 'D' : System.out.println("45 - 59");
            break;
            case 'E' : System.out.println("35 - 44");
            break;
            case 'F' : System.out.println("0 - 34");
            break;
            default: System.out.println("invalid option");

        }
    }
}
