//write a java program to find the missing number from the given array


public class q1 {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 6, 7, 8, 9};
            
            int miEl = fiMiEl(array);
            
            System.out.println("The missing element is: " + miEl);
        }
        
        public static int fiMiEl(int[] array) {
            int n = array.length + 1;
            int expectedSum = n * (n + 1) / 2;
            
            int actualSum = 0;
            for (int num : array) {
                actualSum += num;
            }
            
            return expectedSum - actualSum;
        }
    }
    

