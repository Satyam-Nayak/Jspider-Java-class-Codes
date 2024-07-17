    public class prog1 {
        public static void main(String[] args) {
            int phy = 55;
            int chem = 43;
            int math = 48;
            int option = 62;
             int res = phy + chem + math + option;
             double totalmark = 280;
             double percentage = (res / totalmark )* 100;
            System.out.println(" the scored result is " + res + " and the scored % is " + percentage + " %");
        }
    }