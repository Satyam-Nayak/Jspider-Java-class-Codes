public class factorsofanumber {
    public static void main(String[] args) {
        int numb = 12;
        System.out.println("factors of " + numb + "are");
        for (int i = 1 ; i<= numb ; i++){
            if (numb % i ==0){
                System.out.println(i+" ");
            }
        }
    }
}
