public class pattern6 {
    public static void main(String[] args) {
        
    
        int i,j;
        int n = 5;
    
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if (i==n || i==1) {
                    System.out.print("* ");
                    
                }else{
                    System.out.print("  ");
                }
             
            }
            System.out.println();
        }
    }
}
