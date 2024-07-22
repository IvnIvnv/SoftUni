import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0 ;i < n; i++) {
            int nextNum = Integer.parseInt(scanner.nextLine());
            total = total + nextNum;
            if (nextNum > max) {
                max = nextNum;
            }
        }

        if (total - max == max) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else {
            total = (total - max) - max;
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(total));
        }
    }
}
