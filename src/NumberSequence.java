import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum  = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0 ; i < n ; i++) {
            int nextNum = Integer.parseInt(scanner.nextLine());
            if (nextNum > maxNum) {
                maxNum = nextNum;
            }
            if (nextNum < minNum){
                minNum = nextNum;
            }
        }
        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);
    }
}
