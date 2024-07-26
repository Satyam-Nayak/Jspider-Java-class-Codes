//write a java program to print this pattern
// 1 0 1 0 1
// 1 0 1 0 1
// 1 0 1 0 1
// 1 0 1 0 1
// 1 0 1 0 1

public class neww1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                System.out.print((j%2)+" ");
            }
            System.out.println();
        }
        
    }
    
}
