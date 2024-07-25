//write a java program to orint the java progranm to print the nth prime number (darshn sir)

public class nthprimenumber1 {

    static boolean isPrime(int n){
        int c = 0;
        for (int i = 1; i <=n ; i++){
            if(n%i==0){
                c++;
            }
        }
        return c==2;
    }
    public static void main(String[] args) {
        int c=0;
        int n=4;
        for(int i=1;;i++){
            if(isPrime(i)){
                c++;
                if (c==n) {
                    System.out.println("The "+n+"th prime number is "+i);
                    break;
                    
                }
        }
        
    }
    
    }
}
