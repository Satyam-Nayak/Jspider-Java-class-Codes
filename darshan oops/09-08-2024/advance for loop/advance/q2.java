//write a java program to print duplicate charater in a string using advance for loop

public class q2 {
    public static void main(String[] args) {
        String str = "Hello";
        int[] arr = new int[128];
        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>1){
                System.out.println("Duplicate character: " + ((char)(i)));
            }
    }

    }
    
}
