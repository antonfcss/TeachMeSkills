package lesson2;

import java.util.Scanner;

/**
 * Ввести с клавиатуры 2 числа и присвоить их двум переменным (weight, height).
 * Нарисовать фигуру из буквы О размером weight x height.
 */
public class Task3 {
    public static void main(String[] args) {
        int weight;
        int hight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ширину:");
        weight = sc.nextInt();
        System.out.println("Введите высоту:");
        hight = sc.nextInt();
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print("O ");
            }
            System.out.println();
        }
    }
}
