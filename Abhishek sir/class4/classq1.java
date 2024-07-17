public class classq1 {
    public static void main(String[] args) {
        int balance = 75000; int amount = 73000;
        boolean pancard = true;
        int bankcode = 6;
        if (amount <= balance) // cheking balance
        {
                        //checking for min balance

            if (pancard == true || amount < 50000)
            {
                balance = balance - amount;
                System.out.println("transaction sucess");
            
            if (bankcode == 1)
            {
                if (balance < 10000) 
                {
                    System.out.println("low min-balance");
                    System.out.println(10000 - balance);
                    System.out.println("must be deposite to maintain min-balance");
                }
            }
            if (bankcode == 3 && balance < 5000) // here i use and operator
            
                 
                {
                    System.out.println("low min-balance");
                    System.out.println(5000 - balance);
                    System.out.println("must be deposite to maintain min-balance");
                }
            }
            else 
            {
                System.out.println("pancard link is required");
            }
            
            
        } 
        else 
        {
            System.out.println("insufficent balance");
        }
    }
}
//sir dot define bank code 2 and 4 cause it increase the length of the code
