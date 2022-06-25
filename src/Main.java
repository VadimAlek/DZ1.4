import java.util.Arrays;
public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int zp[] = generateRandomArray();
        System.out.println(Arrays.toString(zp));
        int summa = 0;
        for (int item : zp) {
            summa += item;
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");

        int maximum = zp[0];
        int minimum = zp[0];
        for (int item: zp
             ) {
            if (item > maximum)
                maximum = item;
            if (item < minimum)
                minimum = item;
            System.out.println("Минимальная сумма трат за день составила " + minimum + " рублей.");
            System.out.println("Максимальная сумма трат за день составила " + maximum + " рублей.");
        }
    }
}







