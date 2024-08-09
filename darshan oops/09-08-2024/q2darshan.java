//write a java program  to print how many charater are repeat in the given string

public class q2darshan {
    public static void main(String[] args) {
        String s = "hello";
        int[] arr =new int[128];
        for (int i = 0; i<s.length(); i++){
            arr[s.charAt(i)]++;

        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0){
                System.out.println((char)(i)+"= "+ arr[i]);
            }
        }
    }
}
