public class ice {
    public static void main(String[] args) {
        int day = 3;
        if (day > 7 || day < 1){
            System.out.println("Invalid day");
        }
        if (day == 1 || day == 7)
        {
            System.out.println("Weekend");
        }
        if (day == 2 || day == 3 || day == 4 || day == 5 || day == 6) {
            System.out.println("Weekday");            
        }
    }
}
