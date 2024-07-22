import java.util.Scanner;

public class SmartLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double washingM = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());
        int toys = 0;
        double money = 0;
        double total = 0;

        for (int i = 1;i <= n;i++) {
            if (i % 2 == 0) {
                money = money + (i / 2) * 10 - 1;
            } else {
                toys = toys + 1;
            }
        }
        total = money + (toys * toysPrice);
        if (total >= washingM) {
            System.out.printf("Yes! %.2f", total - washingM);
        } else {
            System.out.printf("No! %.2f", washingM - total);
        }
    }
}
