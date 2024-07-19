//write a java program to find sum of digits is prime number or not
public class taskprime {
    public static void main(String[] args) {
        int num=1234;
        int sum=0;
        int temp=num;
        while(temp>0)
        {
            int rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
            }
            if(sum%2==0)
            System.out.println(sum+ "sum is prime number");
            else
            System.out.println(sum + "sum is not prime number");
            }

    
}
