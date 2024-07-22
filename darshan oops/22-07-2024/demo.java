//write a java program to print the the sum of each digits with the given exponet to them of the given number
public class demo {

    static int power(int base , int exp){
        int pow =1;
        for(int i=1; i<=exp; i++){
            pow = pow * base;
        }
        return pow;
        
    }
    public static void main(String[] args) {
        int num = 7325;
        int exp = 2;
        int sum = 0;
        int rem = 0;
        while (num!=0){
            rem = num%10;
            sum = sum + power(rem,exp);
            num = num/10;
        }
        System.out.println(sum);
    }
}
       