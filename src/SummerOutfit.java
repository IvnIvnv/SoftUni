import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String dayType = scanner.nextLine();
        String outfit;
        String shoes;
        if ("Morning".equals(dayType)) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees , outfit , shoes);
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees , outfit , shoes);
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees , outfit , shoes);
            }
        } else if ("Afternoon".equals(dayType)) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees , outfit , shoes);
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees , outfit , shoes);
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees , outfit , shoes);
            }
        } else {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees , outfit , shoes);
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees , outfit , shoes);
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees , outfit , shoes);
            }
        }
    }
}
