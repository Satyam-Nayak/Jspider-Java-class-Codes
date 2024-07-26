//write a java program to print this pattern
// 1 1 1 1 1
// 0 0 0 0 0
// 1 1 1 1 1
// 0 0 0 0 0
// 1 1 1 1 1

public class demosir {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++){
                System.out.print((j+1)%2 +" ");
            }
            System.out.println();
    }
}
}
