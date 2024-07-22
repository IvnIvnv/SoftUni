import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeOfMeter = Double.parseDouble(scanner.nextLine());
        double distanceSeconds = distanceMeters * timeOfMeter;
        double resistance = Math.floor((distanceMeters / 15)) * 12.5;
        double totalTime = distanceSeconds + resistance;
        if (recordInSec <= totalTime) {
            double timeNeeded = totalTime - recordInSec;
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeNeeded);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
