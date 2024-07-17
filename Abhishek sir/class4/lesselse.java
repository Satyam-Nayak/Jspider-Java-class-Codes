public class lesselse {
    public static void main(String[] args) {
        int bankCode = 9; 
        int balance = 75000; 
        int amount = 70000; 
        boolean pancard = true; 

        String bankName = "";
        int minimumBalance = 0;

        if (bankCode == 1) {
            bankName = "HDFC";
            minimumBalance = 10000;
        }
        if (bankCode == 2) {
            bankName = "SBI";
            minimumBalance = 0;
        }
        if (bankCode == 3) {
            bankName = "Axis";
            minimumBalance = 5000;
        }
        if (bankCode == 4) {
            bankName = "Camara";
            minimumBalance = 0;
        }

        if (bankName.equals("")) {
            System.out.println("Invalid bank code");
            return;
        }

        if (amount >= 50000) {
            if (!pancard) {
                System.out.println("Pancard is mandatory for withdrawals of 50,000 and above");
                return;
            }
        }

        int remainingBalance = balance - amount;

        if (remainingBalance < minimumBalance) {
            int deficit = minimumBalance - remainingBalance;
            System.out.println("Low minimum balance in " + bankName + ". Deposit at least " + deficit + " to maintain minimum balance.");
        } else {
            System.out.println("Withdrawal successful from " + bankName + ". Remaining balance: " + remainingBalance);
        }
    }
}
