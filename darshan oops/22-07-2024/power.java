//write a java program to print if the base is 2 and the exponent is 3 then the out put is 8 like (2 to the power three)

public class power {
    public static void main(String[] args) {
        int base = 2;
        int ex= 3;
        int result = 1;
        for (int i = 1; i <=ex; i++) {
        result = result * base;
        System.out.println(result);
    }
}
}
