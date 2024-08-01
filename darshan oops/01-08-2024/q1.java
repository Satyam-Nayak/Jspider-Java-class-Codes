//How to use Math.random in java programs

public class q1 {
    public static void main(String[] args) {
        System.out.println("============");
        System.out.println(Math.random());
        System.out.println("============");
        int n = (int)(Math.random()*101); //can be any number between 0 to 100 , including 100 also
        System.out.println(n);
    }
    
}
