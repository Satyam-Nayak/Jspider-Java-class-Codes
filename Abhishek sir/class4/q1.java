public class q1 {
    public static void main(String[] args) {
        int bankCode = 1; 
        double balance = 75000;
        double amount = 70000;
        boolean pancard = true;

        double minBalanceHDFC = 10000;
        double minBalanceSBI = 0;
        double minBalanceAxis = 5000;
        double minBalanceCamara = 0;

        if (amount >= 50000) {
            if (!pancard) {
                System.out.println("PAN card is mandatory for withdrawals of 50,000 and above. Please link your PAN card.");
                return;
            }
        }

        if (balance - amount >= 0) {
            balance -= amount;
            if (bankCode == 1) { // HDFC
                if (balance < minBalanceHDFC) {
                    System.out.println("Low minimum balance. You need to deposit " + (minBalanceHDFC - balance) + " to maintain the minimum balance.");
                } else {
                    System.out.println("Withdrawal successful. Remaining balance: " + balance);
                }
            } else if (bankCode == 2) { // SBI
                if (balance < minBalanceSBI) {
                    System.out.println("Low minimum balance. You need to deposit " + (minBalanceSBI - balance) + " to maintain the minimum balance.");
                } else {
                    System.out.println("Withdrawal successful. Remaining balance: " + balance);
                }
            } else if (bankCode == 3) { // Axis
                if (balance < minBalanceAxis) {
                    System.out.println("Low minimum balance. You need to deposit " + (minBalanceAxis - balance) + " to maintain the minimum balance.");
                } else {
                    System.out.println("Withdrawal successful. Remaining balance: " + balance);
                }
            } else if (bankCode == 4) { // Camara
                if (balance < minBalanceCamara) {
                    System.out.println("Low minimum balance. You need to deposit " + (minBalanceCamara - balance) + " to maintain the minimum balance.");
                } else {
                    System.out.println("Withdrawal successful. Remaining balance: " + balance);
                }
            } else {
                System.out.println("Invalid bank code.");
            }
        } else {
            System.out.println("Insufficient balance for the withdrawal.");
        }
    }
}
