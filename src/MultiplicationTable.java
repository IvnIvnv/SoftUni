public class MultiplicationTable {
    public static void main(String[] args) {
        for (int firstNumb = 1; firstNumb <= 10; firstNumb++) {
            for (int secondNum = 1; secondNum <= 10; secondNum++) {
                int multipl = firstNumb * secondNum;
                System.out.printf("%d * %d = %d%n", firstNumb, secondNum, multipl);
            }
        }
    }
}
