public class logic1 {

    
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        boolean result = cc(a,b);
        System.out.println(result);
    }
    public static boolean cc(int a, int b){
        if (a == 6 || b == 6 || a+b == 6 || a-b == 6 || b-a == 6) {
            return true;
                    }
        return false;
    }
}
    

    
