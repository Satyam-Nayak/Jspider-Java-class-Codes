public class pattern14 {
    
        public static void main(String[] args) {
            int i,j;
            int n = 13;
        
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if ( i==1 || j==1 ||i==n|| j==n||i+j==n+1 || i==j) {
                        System.out.print("* ");
                        
                    }else{
                        System.out.print("  ");
                    }
                 
                }
                System.out.println();
            }
        }
        
    }
    
    // i+j==n+1 ||
    //i==1||j==1



//i==1 || j==1 ||i==n|| j==n