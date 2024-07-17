public class abhi1 {
        public static boolean isPositiveEven(int num) {
            return num > 0 && num % 2 == 0;
        }
    
        public static void main(String[] args) {
            System.out.println("Main method started");
            
            int number = 10; 
            boolean result = isPositiveEven(number);
            
            System.out.println("is the " + number + " number is a positive even number:-  " + result);
            
            System.out.println("Main method ended");
        }
       
}
