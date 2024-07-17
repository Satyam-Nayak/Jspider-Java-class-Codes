public class km {
    public static void main(String[] args) {
         double km = 17;

         if ( km<= 2) {
            System.out.println( 30);
         } else if ( km <= 7) {
            System.out.println(30 + (km-2)*20);
         }else if ( km <= 12) {
            System.out.println(130 + (km-7)*25);
         }else if ( km <= 17) {
            System.out.println(255 + (km-12)*30);
         }else  {
            System.out.println(405+ (km-17)*35);
         }
    }
}
