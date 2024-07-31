public class q5 {
        public static void sumAndDifferenceMinMax(int[] array) {
            if (array.length == 0) {
                System.out.println("Array is empty.");
                return;
            }
            
            int min = array[0];
            int max = array[0];
            
            for (int num : array) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
            
            int sum = min + max;
            int difference = max - min;
            
            System.out.println("Sum of min and max elements: " + sum);
            System.out.println("Difference between max and min elements: " + difference);
        }

    
}
