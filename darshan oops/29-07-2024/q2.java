// write a java program to print this pattern 1
                                           // 2 3
                                           // 4 5 6
                                           // 7 8 9 10

public class q2 {
    public static void main(String[] args) {
        
    
        int i,j ;
        int n=4;
        int number=1;

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(number+" ");
                ++number;
    
            }
            System.out.println();
        }
        
    
    }
    
}
