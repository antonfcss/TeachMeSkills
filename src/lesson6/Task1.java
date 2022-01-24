package lesson6;

import java.io.*;
import java.util.Scanner;

/**
 * Потоки ввода вывода
 * создать программу считывающую числа с файла,
 * умножающую их на 10 с последующей записью в новый файл
 */
public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {
        int[] array = null;
        try (BufferedReader in = new BufferedReader(new FileReader("numbers.txt"))) {
            array = in.lines().mapToInt(Integer::parseInt).toArray();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
