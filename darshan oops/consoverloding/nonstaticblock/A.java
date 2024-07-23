public class A {
    static int n=10;
    int m=20;
    {
        System.out.println("non static block");
        System.out.println("n:"+n);
        System.out.println("m:" +m);
        n=100; m=200;
    }
    public static void main(String[] args) {
        System.out.println("Main method...-");
        A a1=new A();
        System.out.println("n:"+ n);
        System.out.println("m:"+ a1.m);    
    }
}
