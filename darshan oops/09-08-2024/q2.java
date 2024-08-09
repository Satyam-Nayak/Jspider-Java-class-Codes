public class q2 {
    public static void main(String[] args) {
        String s = "hello";
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c]++;
        }
        for (int i = 0; i < 128; i++) {
            if (arr[i]!= 0) {
                System.out.println((char) i + "->" + arr[i]);
            }

        }

    }
}
