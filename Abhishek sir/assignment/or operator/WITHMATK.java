public class WITHMATK {
    public static void main(String[] args) {
        int physics = 70;
        int chemistry = 25;
        int math = 70;
        int optional = 90;

        if (physics < 35 || chemistry < 35 || math < 35 || optional < 35) {
            System.out.println("fail");
            if (physics < 35) {
                System.out.println("Failed in Physics" + "=" + physics);
            }
            if (chemistry < 35) {
                System.out.println("Failed in Chemistry" + "=" + chemistry);
            }
            if (math < 35) {
                System.out.println("Failed in Math" + "=" + math);
            }
            if (optional < 35) {
                System.out.println("Failed in Optional" + "="+ optional);
            }
        } else {
            int totalMarks = physics + chemistry + math + optional;
            double fullmark = 400;
            double percentage = (totalMarks / fullmark) * 100;
            System.out.println("Total Percentage: " + percentage + "%");
        }
    }
}
