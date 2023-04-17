import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
        public static void task1() {
            System.out.println("Домашние задания. Массивы");
            System.out.println("Задача 1");
            int[] box = new int[3];
            box[0] = 1;
            box[1] = 2;
            box[2] = 3;
            System.out.println(box[1]);

            double[] values = {1.57, 7.654, 9.986};
            System.out.println(values[1]);

            int[] balls = {9, 4, 7, 1};
            System.out.println(balls[1]);


            System.out.println("Задача 2");
            for (int i = 0; i < box.length; i++) {
                System.out.print(box[i]);
                if (i != box.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i]);
                if (i != values.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = 0; i < balls.length; i++) {
                System.out.print(balls[i]);
                if (i != balls.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();


            System.out.println("Задача 3");
            for (int i = box.length - 1; i >= 0; i--) {
                System.out.print(box[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }

            System.out.println();
            for (int i = values.length - 1; i >= 0; i--) {
                System.out.print(values[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = balls.length - 1; i >= 0; i--) {
                System.out.print(balls[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();


            System.out.println("Задача 4");
            for (int i = 0; i < box.length; i++) {
                if (box[i] % 2 != 0) {
                    box[i] += 1;
                }
            }
            System.out.println(Arrays.toString(box));
        }

    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task2() {
        System.out.println("Домашние задания. Массивы. Урок 2");
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa = summa + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");


        System.out.println("Задача 2");
        int minSumma = 200_001;
        int maxSumma = -1;
        for (int salary : arr ) {
            if (salary < minSumma) {
                minSumma = salary;
            }
            if (salary > maxSumma) {
                maxSumma = salary;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumma + " рублей. " +
                "Максимальная сумма трат за день составила " + maxSumma + " рублей");


        System.out.println("Задача 3");
        double averageSumma = 0;
        averageSumma = (double) summa / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSumma + " рублей");


        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}


