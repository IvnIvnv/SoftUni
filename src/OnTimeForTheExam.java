import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivingHours = Integer.parseInt(scanner.nextLine());
        int arrivingMinutes = Integer.parseInt(scanner.nextLine());
        int hoursDifference = examHours - arrivingHours;
        int hoursInMinutes = (examHours * 60 + examMinutes) - (arrivingHours * 60 + arrivingMinutes);
        if (hoursInMinutes <= 59 && hoursInMinutes >= 0) {
            if (hoursInMinutes < 10 && hoursInMinutes > 0) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", hoursInMinutes);
            } else if (hoursInMinutes <= 30 && hoursInMinutes != 0) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", hoursInMinutes);
            } else if (hoursInMinutes == 0){
                System.out.print("On time");
            } else {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", hoursInMinutes);
            }
        } else if (examHours > arrivingHours) {
            hoursInMinutes = hoursInMinutes % 60;
            if (hoursInMinutes < 10 && hoursInMinutes > 0) {
                System.out.println("Early");
                System.out.printf("%d:0%d hours before the start", (hoursDifference - 1) , hoursInMinutes);
            } else if (hoursInMinutes <= 59 && hoursInMinutes != 0){
                System.out.println("Early");
                System.out.printf("%d:%d hours before the start", (hoursDifference - 1) , hoursInMinutes);
            }  else {
                System.out.println("Early");
                System.out.printf("%d:0%d hours before the start", hoursDifference , hoursInMinutes);
            }
        } else {
            hoursInMinutes = (arrivingHours * 60 + arrivingMinutes) - (examHours * 60 + examMinutes);
            hoursDifference = arrivingHours - examHours;
            if (hoursInMinutes < 10) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", hoursInMinutes);
            } else if (hoursInMinutes < 60) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", hoursInMinutes);
            } else {
                hoursInMinutes = hoursInMinutes % 60;
                if (hoursInMinutes < 10) {
                    System.out.println("Late");
                    System.out.printf("%d:0%d hours after the start",hoursDifference , hoursInMinutes);
                } else {
                    System.out.println("Late");
                    System.out.printf("%d:%d hours after the start",hoursDifference , hoursInMinutes);
                }
            }
        }
    }
}
