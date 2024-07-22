import java.util.Scanner;

public class GodizilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPerStatist = Double.parseDouble(scanner.nextLine());
        double decor = budget / 10;
        double clothesPrice = statists * clothesPerStatist;
        double totalPrice = 0;
        double discount = 0;
        if (statists > 150) {
            discount = clothesPrice / 10;
            clothesPrice = clothesPrice - discount;
            totalPrice = decor + clothesPrice;
            if (totalPrice > budget) {
                budget = totalPrice - budget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", budget);
            } else {
                budget = budget - totalPrice;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", budget);
            }
        } else {
            totalPrice = clothesPrice + decor;
            if (totalPrice <= budget) {
                budget = budget - totalPrice;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", budget);
            } else {
                budget = totalPrice - budget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", budget);
            }
        }
    }
}
