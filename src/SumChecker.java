public class SumChecker {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {

        int a = 10;
        int b = -8;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


    public static void main(String[] args) {
        printColor(-5);
        printColor(50);
        printColor(150);
    }

    public static void printColor(int value) {
        if (value < 0) {
            System.out.println("Красный");
        } else if (value < 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

}