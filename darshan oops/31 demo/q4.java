public class q4 {
        public static void findMinElement(int[] array) {
            if (array.length == 0) {
                System.out.println("Array is empty.");
                return;
            }
            
            int min = array[0];
            for (int num : array) {
                if (num < min) {
                    min = num;
                }
            }
            
            System.out.println("Minimum element: " + min);
        }
    
    
}
