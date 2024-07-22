import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysToStay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String comment = scanner.nextLine();
        int nights = daysToStay - 1;
        double pricePerNights = 0;
        double totalPrice = 0;

        if (roomType.equals("room for one person")) {
            pricePerNights = nights * 18.00;
            totalPrice = pricePerNights;
        } else if (roomType.equals("apartment")) {
            if (nights < 10) {
                pricePerNights = nights * 25.00;
                totalPrice = pricePerNights - (pricePerNights * 0.3);
            } else if (nights <= 15) {
                pricePerNights = nights * 25.00;
                totalPrice = pricePerNights - (pricePerNights * 0.35);
            } else {
                pricePerNights = nights * 25.00;
                totalPrice = pricePerNights - (pricePerNights * 0.5);
            }
        } else if (roomType.equals("president apartment")) {
            if (nights < 10) {
                pricePerNights = nights * 35.00;
                totalPrice = pricePerNights - (pricePerNights * 0.1);
            } else if (nights <= 15) {
                pricePerNights = nights * 35.00;
                totalPrice = pricePerNights - (pricePerNights * 0.15);
            } else {
                pricePerNights = nights * 35.00;
                totalPrice = pricePerNights - (pricePerNights * 0.2);
            }
        }
        if (comment.equals("positive")) {
            totalPrice = totalPrice + (totalPrice * 0.25);
            System.out.printf("%.2f", totalPrice);
        } else if (comment.equals("negative")) {
            totalPrice = totalPrice - (totalPrice * 0.1);
            System.out.printf("%.2f", totalPrice);
        }
    }
}
