public class extra {
    public static void main(String[] args) {
        int[] arr = {12, 3, 2, 4, 9, 7, 6, 6, 1, 21, 8};
        int target = 10;
        boolean[] used = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (used[j]) continue;

                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + "," + arr[j]);
                    used[i] = true;
                    used[j] = true;
                    break;
                }
            }
        }
    }
}
