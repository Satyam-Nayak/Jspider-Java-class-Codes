public class demo2 {
    public static void main(String[] args) {
        System.out.println("start...!");
        for(int i = 1; i<=10; i++){
            if(i==3 || i==7){
                break;
            }
            System.out.println(i);
        }
        System.out.println("end...!");
    }
}
