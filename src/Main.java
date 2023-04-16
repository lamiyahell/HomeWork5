import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Домашние задания. Массивы");
            System.out.println("Задача 1");
            int [] box = new int [3];
            box[0] = 1;
            box[1] = 2;
            box[2] = 3;
            System.out.println(box[1]);

            double [] values = {1.57, 7.654, 9.986};
            System.out.println(values[1]);

            int [] balls = {9, 4, 7, 1};
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
    }
}