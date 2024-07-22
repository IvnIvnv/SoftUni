import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budgetGroup = Integer.parseInt(scanner.nextLine());
        String seasonType = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());
        double rent = 0;
        switch (seasonType) {
            case "Spring" :
                rent = 3000;
                break;
            case "Summer":
                rent = 4200;
                break;
            case "Autumn":
                rent = 4200;
                break;
            case "Winter" :
                rent = 2600;
                break;
        }

        if (seasonType.equals("Summer") || seasonType.equals("Spring") || seasonType.equals("Winter")){
            if (fishermanCount <= 6) {
                rent = rent - rent * 0.1;
                if (fishermanCount % 2 == 0) {
                    rent = rent - rent * 0.05;
                        if (budgetGroup >= rent) {
                            System.out.printf("Yes! You have %.2f leva left.", budgetGroup - rent);
                        } else {
                            System.out.printf("Not enough money! You need %.2f leva.", rent - budgetGroup);
                        }
                } else if (budgetGroup >= rent) {
                    System.out.printf("Yes! You have %.2f leva left.", budgetGroup - rent);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", rent - budgetGroup);
                }
            } else if (fishermanCount <= 11) {
                rent = rent - rent * 0.15;
                if (fishermanCount % 2 == 0) {
                    rent = rent - rent * 0.05;
                    if (budgetGroup >= rent) {
                        System.out.printf("Yes! You have %.2f leva left.", budgetGroup - rent);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", rent - budgetGroup);
                    }
                } else if (budgetGroup >= rent) {
                    System.out.printf("Yes! You have %.2f leva left.", budgetGroup - rent);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", rent - budgetGroup);
                }
            } else {
                rent = rent - rent * 0.25;
                if (fishermanCount % 2 == 0) {
                    rent = rent - rent * 0.05;
                    if (budgetGroup >= rent) {
                        System.out.printf("Yes! You have %.2f leva left.", budgetGroup - rent);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", rent - budgetGroup);
                    }
                } else if (budgetGroup >= rent) {
                    System.out.printf("Yes! You have %.2f leva left.", budgetGroup - rent);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", rent - budgetGroup);
                }
            }
        } else {
            if (fishermanCount <= 6) {
                rent = rent - rent * 0.1;
                if (budgetGroup >= rent) {
                    System.out.printf("Yes! You have %.2f leva left.", budgetGroup - rent);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", rent - budgetGroup);
                }
            } else if (fishermanCount <= 11) {
                rent = rent - rent * 0.15;
                if (budgetGroup >= rent) {
                    System.out.printf("Yes! You have %.2f leva left.", budgetGroup - rent);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", rent - budgetGroup);
                }
            } else {
                rent = rent - rent * 0.25;
                if (budgetGroup >= rent) {
                    System.out.printf("Yes! You have %.2f leva left.", budgetGroup - rent);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", rent - budgetGroup);
                }
            }
        }

    }
}
