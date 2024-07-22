import java.util.Scanner;

public class OddEvenPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = -1000000000.0;
        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = -1000000000.0;

        for (int i = 1 ; i <= n ; i++) {
            double nextNum = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum = evenSum + nextNum;
                if (nextNum > evenMax) {
                    evenMax = nextNum;
                }
                if (nextNum < evenMin) {
                    evenMin = nextNum;
                }
            } else {
                oddSum = oddSum + nextNum;
                if (nextNum > oddMax) {
                    oddMax = nextNum;
                }
                if (nextNum < oddMin) {
                    oddMin = nextNum;
                }
            }
        }

        if (n == 0) {
            System.out.printf("OddSum = %.2f%n", oddSum);
            System.out.println("OddMin = No");
            System.out.println("OddMax = No");
            System.out.printf("EvenSum = %.2f%n", evenSum);
            System.out.println("EvenMin = No");
            System.out.println("EvenMax = No");
        } else if (n == 1) {
            System.out.printf("OddSum = %.2f%n", oddSum);
            System.out.printf("OddMin = %.2f%n", oddMin);
            System.out.printf("OddMax = %.2f%n", oddMax);
            System.out.printf("EvenSum = %.2f%n", evenSum);
            System.out.println("EvenMin = No");
            System.out.println("EvenMax = No");
        } else {
            System.out.printf("OddSum = %.2f%n", oddSum);
            System.out.printf("OddMin = %.2f%n", oddMin);
            System.out.printf("OddMax = %.2f%n", oddMax);
            System.out.printf("EvenSum = %.2f%n", evenSum);
            System.out.printf("EvenMin = %.2f%n", evenMin);
            System.out.printf("EvenMax = %.2f%n", evenMax);
        }
    }
}
