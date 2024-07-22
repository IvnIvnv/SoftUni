import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        int currentGrade = 1;
        double averageGrade = 0;

        while (currentGrade <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4.00) {
                continue;
            }
            averageGrade += grade;
            currentGrade++;
        }
        averageGrade = averageGrade / 12;
        System.out.printf("%s graduated. Average grade: %.2f", studentName , averageGrade);
    }
}
