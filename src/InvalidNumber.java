import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number != 0 && number < 100) {
            System.out.println("invalid");
        } else if (number > 200) {
            System.out.println("invalid");
        }
    }
}
