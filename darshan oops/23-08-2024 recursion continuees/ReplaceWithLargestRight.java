public class ReplaceWithLargestRight {
    static int replaceWithLargest(int[] arr, int currentIndex) {
        if (currentIndex == arr.length - 1) {
            int temp = arr[currentIndex];
            arr[currentIndex] = -1;
            return temp;
        }

        int currentValue = arr[currentIndex];
        int maxInRight = replaceWithLargest(arr, currentIndex + 1);

        if (maxInRight > currentValue) {
            arr[currentIndex] = maxInRight;
        } else {
            arr[currentIndex] = -1;
        }

        return (currentValue > maxInRight) ? currentValue : maxInRight;
    }

    public static void main(String[] args) {
        int[] arr = {4, 55, 23, 8, 19, 33, 7, 9};

        replaceWithLargest(arr, 0);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
