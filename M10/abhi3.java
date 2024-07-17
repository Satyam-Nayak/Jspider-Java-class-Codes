public class abhi3 {
    public static String af(int age) {
        return "$" + age + "$";
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        
        int age = 22; 
        String ffa = af(age);
        
        System.out.println("Formatted age: " + ffa);
        
        System.out.println("Main method ended");
    }
}
