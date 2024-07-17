public class apple {
    public static void main(String[] args) {
        
        int weigh = 842;
        double tp = 325;
        double ammtopay = (tp * weigh) / 1000;
        System.out.println(" apple price = " + ammtopay);
         double gst = (ammtopay * 0.12);
         ammtopay = gst + ammtopay;


         System.out.println("final pay ammount " + ammtopay);


    }
}
