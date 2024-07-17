public class andopp {
    public static void main(String[] args) {
        int phy = 25; int che = 25; int math = 26;  int opt = 10;
        int total = phy + che + math + opt;
        float per = (total/400.0f) * 100;
        System.out.println(" percentage = " + per);
        if (per>= 35 && per < 60) {
            System.out.println("second class");
        } else if (per >= 60 &&  per < 80) {
            System.out.println("first class");
            
        } else if (per >= 80) {
            System.out.println("distiction class");
            
        }
        else{
            System.out.println("fail");
        }

    }
}

// if can be used in every where but else if cant be used in every where
// we can use onlr and operator in range based program
