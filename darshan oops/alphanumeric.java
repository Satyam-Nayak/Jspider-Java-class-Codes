public class alphanumeric {
    public static void main(String[] args) {
        char c = 'h';
        if (c>='A' && c<= 'Z') {
            c+=32;
            System.out.println(c);
            
        } 
        else if (c>= 'a' && c<= 'z') {
            c-=32;
            System.out.println(c);
        }else {
            System.out.println(c);
        }
    }
}
