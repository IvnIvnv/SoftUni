import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yearType = scanner.nextLine();
        double p = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double weekendsSofia = 0;
        double holidays = 0;
        double totalDays = 0;
        weekendsSofia = (48 - h) * 3.0 / 4;
        holidays = p * 2.0 / 3;
        totalDays = weekendsSofia + h + holidays;
        if (yearType.equals("normal")) {
            System.out.printf("%.0f", Math.floor(totalDays));
        } else if (yearType.equals("leap")) {
            double leap = totalDays * 0.15;
            totalDays = totalDays + leap;
            System.out.printf("%.0f", Math.floor(totalDays));
        }
    }
}
