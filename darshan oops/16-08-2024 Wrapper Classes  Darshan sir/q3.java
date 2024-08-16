public class q3 {
    public static void main(String[] args) {
        String s = "123 456 789";
        String[] arr = s.split(" ");
        int sum = 0;
        for(String ele:arr){
            sum += Integer.parseInt(ele);
        }
System.out.println(sum);
    }
}
