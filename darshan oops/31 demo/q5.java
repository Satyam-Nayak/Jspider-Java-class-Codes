//Sum and differance of min and max element in array

public class q5 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        sumAndDifferenceMinMax(array);
    }

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
            
            System.out.println(" sum min and max element: " + sum);
            System.out.println("Difference between max and min: " + difference);
        }

    
}
