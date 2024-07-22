import java.util.Scanner;

public class GraduationPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        int grade = 1;
        int repeat = 0;
        double totalGrade = 0;

        while (grade <= 12) {
            double mark = Double.parseDouble(scanner.nextLine());
            if (mark >= 4) {
                grade++;
                totalGrade += mark;
            } else if (repeat != 1) {
                repeat++;
            } else {
                break;
            }
        }
        if (grade < 12) {
            System.out.printf("%s has been excluded at %d grade", studentName , grade);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", studentName , (totalGrade / 12));
        }
    }
}
