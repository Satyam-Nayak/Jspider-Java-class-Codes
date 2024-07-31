// find min element in array
public class q4 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 7};
        findMinElement(array);
    }
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
            
            System.out.println("minimum element is: " + min);
        }
    
    
}
