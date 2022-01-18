package lesson4;

import java.util.Scanner;
/**
 * В спортивном центре есть три возрастные группы для занятий волейболом:
 * 1 группа - от 7 до 13 лет;
 * 2 группа - от 14 до 17 лет;
 * 3 группа - от 18 до 65 лет.
 * Напишите метод, который принимает возраст человека и возвращает целое число,
 * которое обозначает номер группы в которую его надо определить, если подходящей группы нет - верните ‘-1’.
 */
public class Task1 {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите возраст");
        System.out.println("Номер группы: " + getGroupNumber(SC.nextInt()));
    }

    public static int getGroupNumber(int age) {

        if (age >= 7 && age <= 13) {
            return 1;
        }
        if (age >= 14 && age <= 17) {
            return 2;
        }
        if (age >= 18 && age <= 65) {
            return 3;
        }
        return -1;
    }
}
