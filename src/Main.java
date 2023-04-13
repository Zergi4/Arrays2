// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int summ = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей.");
    }
}