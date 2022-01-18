package lesson2;

/**
 * Создать 10 переменных, 5 проинициализировать сразу, 5 в ходе выполнения программы,
 * причем вторые 5 проинициализировать из первых 5. (*, /, -, %), также использовать все числовые типы
 */
public class Task2 {
    public static void main(String[] args) {
        byte a1 = 5;
        short a2 = 200;
        int a3 = 10000;
        long a4 = 100000;
        float a5 = 1.5f;

        byte b1 = (byte) (a1 + a2);
        short b2 = (short) (a2 / a1);
        int b3 = (int) (a5 + a1);
        long b4 = (a3 + a4) / a2;
        double b5 = a4 / a3;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
