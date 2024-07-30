// A 
// A B
// A B C
// A B C D
// A B C D E

public class q3 {
    public static void main(String[] args) {
        
    
        int i,j ;
        int n=5;

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print((char) ('A' + j - 1) + " ");
            }
            System.out.println();
        }
    }
}