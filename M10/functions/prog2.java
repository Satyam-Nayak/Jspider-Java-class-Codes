public class prog2 {

    public static void test() {
        System.out.println("running test () function body____");
        
    }
    public static void disp() {
        System.out.println(" runnig disp() finctionbody startedd.....");
        test();
        System.out.println(" runnig disp() finctionbody eddded.....");

    }
    public static void main(String[] args) {
        System.out.println("Main Method started");
    
        disp();
        System.out.println("main method endedd");

        // chain of function (method of chaining  )
    }

    
}