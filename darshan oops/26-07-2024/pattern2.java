//write a java program to print a partten like this  11 12 13
                                                 //  21 22 23
                                                 //  31 32 33
public class pattern2 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=3;i++){
            for(j=1;j<=3;j++){
                System.out.print(i+""+j+" ");
            }
            System.out.println();
        }
        
    }
}
