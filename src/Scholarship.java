import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wage = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minWage = Double.parseDouble(scanner.nextLine());
        double social = 0.35 * minWage;
        double excellent = 25 * grade;

        if (grade <= 4.50) {
            System.out.println("You cannot get a scholarship!");
        } else if (grade > 4.50 && grade < 5.50) {
            if (wage < minWage) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(social));
            } else {
                System.out.println("You cannot get a scholarship!");
            }
        } else if (grade >= 5.50) {
            if (wage < minWage) {
                if (social < excellent) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellent));
                } else {
                    System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(social));
                }
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellent));
            }
        }
    }
}
