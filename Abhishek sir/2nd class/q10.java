public class q10 {
    public static void calculateArea ( double r , double h) {
        double area = (3.14 * r * r * h) / 3;
        System.out.println("The volume of the cone is " + area);
        }
        public static void main(String[] args) {
            double r = 5.0, h = 10.0;
            calculateArea(r, h);
    }
}
