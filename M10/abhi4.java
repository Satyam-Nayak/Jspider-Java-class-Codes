public class abhi4 {
        public static boolean isDivisible(int num) {
            return num > 0 && (num % 4 == 0 || num % 5 == 0);
        }
    
        public static void main(String[] args) {
            System.out.println("Main method started");
            
            int number = 26; 
            boolean result = isDivisible(number);
            
            System.out.println("is the number " + number + " divisible by either 4 or 5 " + result);
            
            System.out.println("Main method ended");
        }
    
    
}
