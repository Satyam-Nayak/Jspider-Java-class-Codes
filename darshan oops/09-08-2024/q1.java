public class q1 {
    public static void main(String[] args) {
        int[] arr=new int[128];
        arr['A']=100;
        arr['b']=200;
        arr['A']++;  //it update the value like A=100 then A++ equals A++ means 100+1=101
        System.out.println(arr[65]);
        System.out.println(arr[66]);
        System.out.println(arr[98]);

    }
}
