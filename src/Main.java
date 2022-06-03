public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        // Task_1
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
        System.out.println();
        // Task_2
        int max = 200000;
        int min = 100000;
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
                System.out.println("Минимальная трата за месяц составила" + max + " рублей");
            } else if (min < arr[i]) {
                min = arr[i];
                System.out.println("Максимальная трата за месяц составила " + min + " рублей");
            }
        }
        System.out.println();
        //Task_3
        double middle = sum / 30;
        System.out.println("Среднее значение трат за месяц " + middle + " рублей");

        System.out.println();
        // Task_4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        // Task_5

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.print(arr[i] + " ");
            System.out.print("");
        }
        return arr;
    }
}