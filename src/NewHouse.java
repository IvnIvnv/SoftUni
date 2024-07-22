import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double flowerPrice = 0;
        double discount = 0;
        switch (flower) {
            case "Roses" :
                flowerPrice = 5;
                break;
            case  "Dahlias":
                flowerPrice = 3.80;
                break;
            case "Tulips":
                flowerPrice = 2.80;
                break;
            case "Narcissus" :
                flowerPrice = 3;
                break;
            case "Gladiolus":
                flowerPrice = 2.5;
                break;
        }
        //· Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //· Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена
        //· Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //· Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //· Ако Нели упи по-малко от 80 Гладиоли - цената се оскъпява с 20
        double totalPrice = count * flowerPrice;
        if (count > 80 && flower.equals("Roses")) {
            totalPrice =  totalPrice - 0.1 * totalPrice;
            if (budget >= totalPrice) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count , flower , (budget - totalPrice));
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", (totalPrice - budget));
            }
        } else if (count > 90 && flower.equals("Dahlias")) {
            totalPrice = totalPrice - 0.15 * totalPrice;
            if (budget >= totalPrice) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, (budget - totalPrice));
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", (totalPrice - budget));
            }
        } else if (count > 80 && flower.equals("Tulips")) {
            totalPrice = totalPrice - 0.15 * totalPrice;
            if (budget >= totalPrice) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, (budget - totalPrice));
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", (totalPrice - budget));
            }
        } else if (count < 120 && flower.equals("Narcissus")) {
            totalPrice = totalPrice + 0.15 * totalPrice;
            if (budget >= totalPrice) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, (budget - totalPrice));
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", (totalPrice - budget));
            }
        } else if (count < 80 && flower.equals("Gladiolus")) {
            totalPrice = totalPrice + 0.2 * totalPrice;
            if (budget >= totalPrice) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, (budget - totalPrice));
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", (totalPrice - budget));
            }
        } else if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, (budget - totalPrice));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", (totalPrice - budget));
        }
    }
}
