import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();

        switch (animal) {
            case "dog" :
                System.out.print("mammal");
                break;
            case "crocodile" , "tortoise" , "snake" :
                System.out.print("reptile");
                break;
            default:
                System.out.print("unknown");
                break;
        }
    }
}
