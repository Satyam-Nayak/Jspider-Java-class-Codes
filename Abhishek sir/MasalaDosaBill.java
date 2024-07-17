public class MasalaDosaBill {
    public static void main(String[] args) {
        int numberOfPeople = 6; 
        double costPerDosa = 115.0; 
        double gstRate = 0.18; 

        double totalCostBeforeGST = numberOfPeople * costPerDosa;

        double gstAmount = totalCostBeforeGST * gstRate;

        double totalCostAfterGST = totalCostBeforeGST + gstAmount;

        System.out.printf("The final amount Sonu has to pay is: %.2f\n", totalCostAfterGST);
    }
}
