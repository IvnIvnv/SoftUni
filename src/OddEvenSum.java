import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0 ; i < n ; i++) {
            int nextNum = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum = evenSum + nextNum;
            } else {
                oddSum = oddSum + nextNum;
            }
        }

        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", oddSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(oddSum - evenSum));
        }
    }
}
