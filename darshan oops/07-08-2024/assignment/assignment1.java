import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String oriS = scanner.nextLine();
        System.out.print("Enter the special number: ");
        String speciN = scanner.nextLine();

        String result = "";
        for (char digitChar : speciN.toCharArray()) {
            int index = digitChar - '0';
            result += (index >= 0 && index < oriS.length()) ? 
                (index % 2 == 0 && "AEIOUaeiou".indexOf(oriS.charAt(index)) != -1 ? '@' : oriS.charAt(index)) : '#';
        }
        System.out.println("Modified string: " + result);
        scanner.close();
    }
}
