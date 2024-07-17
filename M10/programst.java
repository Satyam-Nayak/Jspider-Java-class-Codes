public class programst {
    public static int test() 
    {
        System.out.println("running test() method");
        return 200;
    }
    public static void main(String[] args){
        System.out.println("running main method");
        test();
        System.out.println(test());
        int res = test();
        System.out.println("res value is " + res);
        System.out.println("main mathod ended");
    }
}
