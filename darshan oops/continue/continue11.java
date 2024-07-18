public class continue11 {
    public static void main(String[] args) {
        for(int i = 100 ; i <=500; i++) {
            if (i%3 == 0 || i% 7 ==0 || i%11 ==0) {
                continue;
            }
            System.out.println(i);

        }
    }
}

//using continue we can skip the current itration
//when we use no equal to (!= ) it print all numbeer still
