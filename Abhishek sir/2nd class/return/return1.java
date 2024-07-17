public class return1 {

    public static double calculateArea(double radius) {
        double value = 3.14 * radius * radius;
        return value;  
    }

    public static void main(String[] args) {
        double radius = 4.0;  
        double area = calculateArea(radius);  
        System.out.println("The area of a circle with radius " + radius + " is: " + area);  
    }
}
