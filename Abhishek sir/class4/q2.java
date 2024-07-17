public class q2 {
    public static void main(String[] args) {
        int bankcode = 1;
        int balance = 75000;
        int amount = 70000;
        boolean pancard = true;

        double minhdfc= 10000;
        double minsbi= 0;
        double minaxis = 5000;
        double mincamara = 0;

        if (amount < 50000 || pancard) {
        } else {
            System.out.println("PAN card is mandatory for withdrawals of 50,000 and above. Please link your PAN card.");
            return;
        }
        
         if (balance - amount >= 0) {
            balance -= amount;
            if (bankcode == 1){
                if(balance < minhdfc) {
                    System.out.println("low min-balance. you need to deposite "+ (minhdfc - balance)+ " to maintained the minimum balance");

                } else{
                    System.out.println("withdrowal is success. remaing amount is : "+ balance);
                }
                } else if (bankcode == 2) {
                    if (balance < minsbi) {
                        System.out.println("low min-balance. you need to deposite "+ (minsbi - balance) + "to maintain the minimum balance.");
            } else {
                System.out.println("withdrowal is success. remaing amount is : " + balance);
            }
            } else if (bankcode == 3) {
                if (balance < minaxis) {
                    System.out.println("low min-balance. you need to deposite "+ (minaxis - balance) + " to maintain the minimum balance. ");
                    } else {
                        System.out.println("withdrowal is success. remaing amount is : " + balance);
            }
         } else if (bankcode == 4) {
            if (balance < mincamara) {
                System.out.println("low min-balance. you need to deposite "+ (mincamara - balance) + " to maintain the minimum balance. ");
                } else {
                    System.out.println("withdrowal is success. remaing amount is : " + balance);
        }
    } else {
        System.out.println("invalid bank code");
    }

} else {
    System.out.println("insufficient balance");
}
    }
}

