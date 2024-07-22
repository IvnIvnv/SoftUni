import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int highestNum = Integer.MIN_VALUE;

        while (i < amount) {
            int nextNum = Integer.parseInt(scanner.nextLine());
            if (nextNum > highestNum) {
                highestNum = nextNum;
            }
            i++;
        }

        System.out.print(highestNum);
    }
}
