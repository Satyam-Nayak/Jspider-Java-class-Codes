public class abhi5 {
        public static boolean Positive(int num) {
            return num > 0 && num % 2 != 0;
        }
    
        public static void main(String[] args) {
            System.out.println("Main method started");
            
            int number = 15; 
            boolean result = Positive(number);
            
            System.out.println("Is the number " + number + " a positive odd number? " + result);
            
            System.out.println("Main method ended");
        }
    
    
}
