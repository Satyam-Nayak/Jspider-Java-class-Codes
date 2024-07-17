public class notimplimantation {
    public static void main(String[] args) {
        int i = 0;
        for (i=1; i<= 5; i++) ;  // if we put a semi colon it will not go for implimantion

        // The line for (i=1; i<= 5; i++) ; ends with a semicolon (;). 
        //In Java, a semicolon directly after a control structure (like for, while, if, etc.) indicates an empty statement. 
        //This means the loop executes with an empty body and increments i from 1 to 6 (after the loop exits).
        {
            System.out.println(i);
        }
    }
}
