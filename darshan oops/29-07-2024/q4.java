// A
// B C
// D E F
// G H I J
// K L M N O
public class q4 {
    public static void main(String[] args) {
        
    
        int i,j ;
        int n=5;
        char number='A';

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(number+" ");
                ++number;
    
            }
            System.out.println();
        }
    }
}