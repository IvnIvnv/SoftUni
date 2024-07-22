import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        char sex = scanner.nextLine().charAt(0);

        if (age < 16) {
            if (sex == 'm') {
                System.out.print("Master");
            } else if (sex == 'f'){
                System.out.print("Miss");
            }
        } else if (age >= 16){
            if (sex == 'm') {
                System.out.print("Mr.");
            } else if (sex == 'f'){
                System.out.print("Ms.");
            }
        }
    }
}
