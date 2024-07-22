import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        if (sales >= 0 && sales <= 500) {
            if (town.equals("Sofia")) {
                System.out.printf("%.2f", sales * 0.05);
            } else if (town.equals("Varna")) {
                System.out.printf("%.2f", sales * 0.045);
            } else if (town.equals("Plovdiv")) {
                System.out.printf("%.2f", sales * 0.055);
            } else {
                System.out.print("error");
            }
        } else if ( sales > 500 && sales <= 1000) {
            if (town.equals("Sofia")) {
                System.out.printf("%.2f", sales * 0.07);
            } else if (town.equals("Varna")) {
                System.out.printf("%.2f", sales * 0.075);
            } else if (town.equals("Plovdiv")) {
                System.out.printf("%.2f", sales * 0.08);
            } else {
                System.out.print("error");
            }
        } else if (sales > 1000 && sales <= 10000) {
            if (town.equals("Sofia")) {
                System.out.printf("%.2f", sales * 0.08);
            } else if (town.equals("Varna")) {
                System.out.printf("%.2f", sales * 0.1);
            } else if (town.equals("Plovdiv")) {
                System.out.printf("%.2f", sales * 0.12);
            } else {
                System.out.print("error");
            }
        } else if (sales > 10000) {
            if (town.equals("Sofia")) {
                System.out.printf("%.2f", sales * 0.12);
            } else if (town.equals("Varna")) {
                System.out.printf("%.2f", sales * 0.13);
            } else if (town.equals("Plovdiv")) {
                System.out.printf("%.2f", sales * 0.145);
            } else {
                System.out.print("error");
            }
        } else {
            System.out.print("error");
        }
    }
}
