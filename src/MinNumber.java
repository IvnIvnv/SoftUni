import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());
        int lowestNum = Integer.MAX_VALUE;
        int i = 0;

        while (i < amount) {
            i++;
            int nextNum = Integer.parseInt(scanner.nextLine());
            if (nextNum < lowestNum) {
                lowestNum = nextNum;
            }
        }
        System.out.print(+lowestNum);
    }
}