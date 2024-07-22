import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftNum = 0;
        int rightNum = 0;
        int total = 0;

        for (int i = 0 ; i < n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            leftNum = leftNum + num;
        }

        for (int i = 0 ; i < n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            rightNum = rightNum + num;
        }

        if (leftNum == rightNum) {
            System.out.printf("Yes, sum = %d", leftNum);
        } else {
            total = rightNum - leftNum;
            System.out.printf("No, diff = %d", Math.abs(total));
        }
    }
}
