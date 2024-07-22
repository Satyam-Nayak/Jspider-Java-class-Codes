class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    void perimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter is " + perimeter);
    }

    void area() {
        double area = side * side;
        System.out.println("Area is " + area);
    }
}

public class DemoS {
    public static void main(String[] args) {
        System.out.println("Main method started ===========");
        Square s1 = new Square(5);
        s1.perimeter();
        s1.area();
        System.out.println("Main method ended ===========");
    }
}
