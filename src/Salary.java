import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int webTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int charge = 0;

        for (int i = 1 ; i <= webTabs ; i++ ) {
            String website = scanner.nextLine();
            if (website.equals("Facebook")) {
                charge = charge + 150;
                if (charge >= salary) {
                    System.out.println("You have lost your salary.");
                    break;
                }
            } else if (website.equals("Instagram")) {
                charge = charge + 100;
                if (charge >= salary) {
                    System.out.println("You have lost your salary.");
                    break;
                }
            } else if (website.equals("Reddit")) {
                charge = charge + 50;
                if (charge >= salary) {
                    System.out.println("You have lost your salary.");
                    break;
                }
            }
            if (i == webTabs) {
                System.out.print(salary - charge);
            }
        }
    }
}
