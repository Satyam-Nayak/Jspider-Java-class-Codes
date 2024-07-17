public class return3 {
    public static int calculateArea ( double base, double height) {
        double area = 0.5 * base * height;
        return (int) area;
        
    }
    public static void main(String[] args) {
        int base = 6;
        int height = 8;
        int calarea = calculateArea(base, height);
        System.out.println("Area of triangle is " + calarea);
    }
    
}
