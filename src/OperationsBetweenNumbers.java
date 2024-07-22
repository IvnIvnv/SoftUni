import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        String symbol = scanner.nextLine();
        double result = 0;
        if (symbol.equals("+")) {
            result = firstNum + secondNum;
            if (result % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", firstNum , symbol , secondNum , result);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", firstNum , symbol , secondNum , result);
            }
        } else if (symbol.equals("-")) {
            result = firstNum - secondNum;
            if (result % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", firstNum , symbol , secondNum , result);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", firstNum , symbol , secondNum , result);
            }
        } else if (symbol.equals("*")) {
            result = firstNum * secondNum;
            if (result % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", firstNum, symbol, secondNum, result);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", firstNum, symbol, secondNum, result);
            }
        } else if (symbol.equals("/")) {
            if (secondNum == 0) {
                System.out.printf("Cannot divide %.0f by zero", firstNum);
            } else {
                result = firstNum / secondNum;
                System.out.printf("%.0f %s %.0f = %.2f", firstNum, symbol, secondNum, result);
            }
        } else if (symbol.equals("%")) {
            if (secondNum == 0) {
                System.out.printf("Cannot divide %.0f by zero", firstNum);
            } else {
                result = firstNum % secondNum;
                System.out.printf("%.0f %s %.0f = %.0f", firstNum, symbol, secondNum, result);
            }
        }
    }
}
