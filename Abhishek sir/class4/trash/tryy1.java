public class tryy1 {
    public static void main(String[] args) {
        int bankcode = 1;
        int balance = 75000;
        int amount = 70000;
        boolean pancard = true;

        double minhdfc = 10000;
        double minsbi = 0;
        double minaxis = 5000;
        double mincamara = 0;

        boolean panRequired = (amount < 50000 || pancard);

if (panRequired) {
    System.out.println("PAN card is mandatory for withdrawals of 50,000 and above. Please link your PAN card.");
} else {
    // Continue with the rest of the code
    if (balance - amount >= 0) {
        balance -= amount;
        
        if (bankcode == 1) {
            if (balance < minhdfc) {
                System.out.println("Low min-balance. You need to deposit " + (minhdfc - balance) + " to maintain the minimum balance");
            } else {
                System.out.println("Withdrawal is successful. Remaining amount is: " + balance);
            }
        } else if (bankcode == 2) {
            if (balance < minsbi) {
                System.out.println("Low min-balance. You need to deposit " + (minsbi - balance) + " to maintain the minimum balance");
            } else {
                System.out.println("Withdrawal is successful. Remaining amount is: " + balance);
            }
        } else if (bankcode == 3) {
            if (balance < minaxis) {
                System.out.println("Low min-balance. You need to deposit " + (minaxis - balance) + " to maintain the minimum balance");
            } else {
                System.out.println("Withdrawal is successful. Remaining amount is: " + balance);
            }
        } else if (bankcode == 4) {
            if (balance < mincamara) {
                System.out.println("Low min-balance. You need to deposit " + (mincamara - balance) + " to maintain the minimum balance");
            } else {
                System.out.println("Withdrawal is successful. Remaining amount is: " + balance);
            }
        } else {
            System.out.println("Invalid bank code");
        }
    } else {
        System.out.println("Insufficient balance");
    }
}}}
