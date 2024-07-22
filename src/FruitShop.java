import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        double banana = 0;
        double apple = 0;
        double orange = 0;
        double grapefruit = 0;
        double kiwi = 0;
        double pineapple = 0;
        double grapes = 0;
        double price = 0;

        switch (dayOfTheWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                banana = 2.5;
                apple = 1.2;
                orange = 0.85;
                grapefruit = 1.45;
                kiwi = 2.70;
                pineapple = 5.5;
                grapes = 3.85;
                break;
            case "Saturday":
            case "Sunday":
                banana = 2.7;
                apple = 1.25;
                orange = 0.9;
                grapefruit = 1.60;
                kiwi = 3.0;
                pineapple = 5.60;
                grapes = 4.20;
                break;
        }
        if (!dayOfTheWeek.equals("Monday")
                && !dayOfTheWeek.equals("Tuesday")
                && !dayOfTheWeek.equals("Wednesday")
                && !dayOfTheWeek.equals("Thursday")
                && !dayOfTheWeek.equals("Friday")
                && !dayOfTheWeek.equals("Saturday")
                && !dayOfTheWeek.equals("Sunday")) {
            System.out.print("error");
        } else if (fruit.equals("banana")) {
            System.out.printf("%.2f", banana * count);
        } else if (fruit.equals("apple")) {
            System.out.printf("%.2f", apple * count);
        } else if (fruit.equals("orange")) {
            System.out.printf("%.2f", orange * count);
        } else if (fruit.equals("grapefruit")) {
            System.out.printf("%.2f", grapefruit * count);
        } else if (fruit.equals("kiwi")) {
            System.out.printf("%.2f", kiwi * count);
        } else if (fruit.equals("pineapple")) {
            System.out.printf("%.2f", pineapple * count);
        } else if (fruit.equals("grapes")) {
            System.out.printf("%.2f", grapes * count);
        } else {
            System.out.print("error");
        }
    }
}
