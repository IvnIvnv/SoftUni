import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        int payments = 0;
        double total = 0;

        while (payments < input) {
            String nextPayment = scanner.nextLine();
            if (Double.parseDouble(nextPayment) <= 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                total += Double.parseDouble(nextPayment);
                System.out.printf("Increase: %.2f%n", Double.parseDouble(nextPayment));
            }
            payments++;
        }
        System.out.printf("Total: %.2f", total);
    }
}
