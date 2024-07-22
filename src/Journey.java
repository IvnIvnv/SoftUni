import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double seasonPrice = 0;
        String type = "type";
        switch (season) {
            case "summer":
                type = "Camp" ;
                break;
            case "winter" :
                type = "Hotel";
                break;
        }
        if (budget <= 100) {
            if (season.equals("summer")) {
                seasonPrice = budget * 0.3;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("%s - %.2f", type , seasonPrice);
            } else {
                seasonPrice = budget * 0.7;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("%s - %.2f", type , seasonPrice);
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                seasonPrice = budget * 0.4;
                System.out.println("Somewhere in Balkans");
                System.out.printf("%s - %.2f", type , seasonPrice);
            } else {
                seasonPrice = budget * 0.8;
                System.out.println("Somewhere in Balkans");
                System.out.printf("%s - %.2f", type , seasonPrice);
            }
        } else {
            seasonPrice = budget * 0.9;
            type = "Hotel" ;
            if (season.equals("summer")) {
                System.out.println("Somewhere in Europe");
                System.out.printf("%s - %.2f", type , seasonPrice);
            } else if (season.equals("winter")){
                System.out.println("Somewhere in Europe");
                System.out.printf("%s - %.2f", type , seasonPrice);
            }
        }
    }
}
