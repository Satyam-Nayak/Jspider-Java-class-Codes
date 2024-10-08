// Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.


// sum67([1, 2, 2]) → 5
// sum67([1, 2, 2, 6, 99, 99, 7]) → 5
// sum67([1, 1, 6, 7, 2]) → 4
public class sum67codingbat {
    public int sum67(int[] nums) {
        int sum = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 6) {
                while (i < nums.length && nums[i]!= 7) {
                    i++;
                }
                if (i < nums.length) {
                    i++;
                }
            } else {
                sum += nums[i];
                i++;
            }
        }
        return sum;

    }
    
    
}
