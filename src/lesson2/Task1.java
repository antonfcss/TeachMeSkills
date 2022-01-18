package lesson2;

import java.lang.Math;

/**
 * Создать 3 числа типа int, short, byte. Вывести на экран макс значение, мин значение и среднее
 */
public class Task1 {
    public static void main(String[] args) {

        byte minNumb = 100;
        short midlNumb = 500;
        int maxNumb = -13;

        System.out.println("Максимальное значение: " + Math.max(minNumb, Math.max(midlNumb, maxNumb)));
        System.out.println("Минимальное значение: " + Math.min(minNumb, Math.min(midlNumb, maxNumb)));
        System.out.println("Среднее значение: " + Math.max(Math.min(minNumb, midlNumb), Math.min(midlNumb, maxNumb)));
    }
}
