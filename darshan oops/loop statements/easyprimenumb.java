public class easyprimenumb {
    public static void main(String[] args) {
        int numb = 2;
        int count =0;
        System.out.println("factors of " + numb + "are");
        for (int i = 1 ; i<= numb ; i++){
            if (numb % i ==0){
                System.out.println(i+" ");
                count++;
            }
        }
        //here sir use count as a counter if a number ony have 2 factors like 1 or it self then it will be a prime number by using this logic we can also use to calculate a prime number
        if (count==2){
            System.out.println("Prime number");
        } else {
            System.out.println("Not a Prime number");
        }
        System.out.println("number of factors are:" + count);

    }
}
