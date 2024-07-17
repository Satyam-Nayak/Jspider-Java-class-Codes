public class factorss {
    public static void main(String[] args) {
        int numb = 12;
        int count =0;
        System.out.println("factors of " + numb + "are");
        for (int i = 1 ; i<= numb ; i++){
            if (numb % i ==0){
                System.out.println(i+" ");
                count++;
            }
        }
        System.out.println("number of factors are:" + count);

    }
}

//use for loop for print the factors of a given nuber and also add count to print the number of facter total excute
