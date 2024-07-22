import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double flat = 0;
        double studioPrice = 0;
        double flatPrice = 0;
        double discountStudio = 0;
        double discountFlat = 0;

        switch (season) {
            case "May" :
                studio = 50;
                flat = 65;
                break;
            case "October" :
                studio = 50;
                flat = 65;
                break;
            case "June" :
                studio = 75.20;
                flat = 68.70;
                break;
            case "September" :
                studio = 75.20;
                flat = 68.70;
                break;
            case "July" :
                studio = 76;
                flat = 77;
                break;
            case "August" :
                studio = 76;
                flat = 77;
                break;
        }
        if (season.equals("May") || season.equals("October")) {
            if (days > 7 && days <= 14) {
                discountStudio = (days * studio) * 0.05;
                studioPrice = days * studio - discountStudio;
                flatPrice = days * flat;
                System.out.printf("Apartment: %.2f lv.%n", flatPrice);
                System.out.printf("Studio: %.2f lv.", studioPrice);
            } else if (days > 14) {
                discountStudio = (days * studio) * 0.3;
                studioPrice = days * studio - discountStudio;
                discountFlat = (days * flat) * 0.1;
                flatPrice = days * flat - discountFlat;
                System.out.printf("Apartment: %.2f lv.%n", flatPrice);
                System.out.printf("Studio: %.2f lv.", studioPrice);
            } else {
                System.out.printf("Apartment: %.2f lv.%n", (days * flat));
                System.out.printf("Studio: %.2f lv.", (days * studio));
            }
        } else if (season.equals("June") || season.equals("September")) {
            if (days > 14) {
                discountStudio = (days * studio) * 0.2;
                studioPrice = days * studio - discountStudio;
                discountFlat = (days * flat) * 0.1;
                flatPrice = days * flat - discountFlat;
                System.out.printf("Apartment: %.2f lv.%n", flatPrice);
                System.out.printf("Studio: %.2f lv.", studioPrice);
            } else {
                System.out.printf("Apartment: %.2f lv.%n", (days * flat));
                System.out.printf("Studio: %.2f lv.", (days * studio));
            }
        } else if (season.equals("July") || season.equals("August")) {
            if (days > 14) {
                discountFlat = (days * flat) * 0.1;
                flatPrice = days * flat - discountFlat;
                System.out.printf("Apartment: %.2f lv.%n", flatPrice);
                System.out.printf("Studio: %.2f lv.", (days * studio));
            } else {
                System.out.printf("Apartment: %.2f lv.%n", (days * flat));
                System.out.printf("Studio: %.2f lv.", (days * studio));
            }
        }
    }
}
