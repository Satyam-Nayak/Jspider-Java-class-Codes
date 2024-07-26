//write a java program to print this pattern  2 3 4 5 6
                                           // 3 4 5 6 7
                                           // 4 5 6 7 8
                                           // 5 6 7 8 9
                                           // 6 7 8 9 10

public class new1234 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(j+i+" ");
            }
            System.out.println();
        }
        
    }
    
}
