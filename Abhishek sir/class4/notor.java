public class notor {
    public static void main(String[] args) {
        int bankCode = 1; 
        int balance = 75000;
        int amount = 70000;
        boolean pancard = true;

        int minimumBalance = 0;
        String bankName = "";

        
        if (bankCode == 1) {
            bankName = "HDFC";
            minimumBalance = 10000;
        }  if (bankCode == 2) {
            bankName = "SBI";
            minimumBalance = 0;
        }  
        if (bankCode == 3) {
            bankName = "Axis";
            minimumBalance = 5000;
        } 
         if (bankCode == 4) {
            bankName = "Canara";
            minimumBalance = 0;
        }
        

        if (amount < 50000 || pancard) {
        } else {
            System.out.println("PAN card is mandatory for withdrawals of 50,000 and above. Please link your PAN card.");
            return;
        }

        if (balance - amount < minimumBalance) {
            int shortfall = minimumBalance - (balance - amount);
            System.out.println("Low minimum balance in " + bankName + ". Deposit at least " + shortfall + " to maintain minimum balance.");
        } else {
            System.out.println("Withdrawal successful.");
        }
        
    }
}
