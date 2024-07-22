class circle{
    double radius;
    final static double pi=3.14;

    public circle(double radius) {
        this.radius = radius;
    }

    void diameter(){
        double diameter = radius*2;
        System.out.println("diameter is" +diameter);
    }

    void area(){
        double area=pi*radius*radius;
        System.out.println("area is" +area);
    }

    void circumference(){
        double circum = 2*pi*radius;
        System.out.println("circumference is " +circum);
    }


}

public class demo6 {
    public static void main(String[] args) {
        System.out.println("main method started ===========");
        circle c1=new circle(5.5);
        c1.diameter();
        c1.area();
        c1.circumference();
        System.out.println("second object values +++++++++++++++++");
        circle c2 = new circle(8.9);
        c2.diameter();
        c2.area();
        c2.circumference();
        System.out.println("main method ended ===========");
    }
}