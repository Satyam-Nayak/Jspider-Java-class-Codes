public class q2
 {
    public static void main(String[] args) {
        int ans = Integer.max(12,5);
        System.out.println(ans);
        //parse-> conversion
        //parseInt("Str") -> converted in int
        //Str -> it should contains only number
        String s1= "1235";
        int n = Integer.parseInt(s1);
        System.out.println(n);
        System.out.println(n+5);
        //parseDouble("str") -> converted in double
        //str-> it should contains
        String s2="45.6";
        double d = Double.parseDouble(s2);
        System.out.println(d);
        System.out.println(d+10);
    }
}
