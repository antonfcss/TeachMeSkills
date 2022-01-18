package lesson3;

import java.util.Scanner;

public class Computer {

    private final Ram ram;
    private final Cpu cpu;
    private final DataStorage dataStorage;
    private final String type;
    private final double cost;
    private final String brand;
    private final String model;
    public int maxWorkingCount;
    private boolean powerOn = false;
    private static final Scanner SCANNER = new Scanner(System.in);

    public Computer(Ram ram, Cpu cpu, DataStorage dataStorage, String type,
                    double cost, String brand, String model, int maxWorkingCount) {
        this.ram = ram;
        this.cpu = cpu;
        this.dataStorage = dataStorage;
        this.type = type;
        this.cost = cost;
        this.brand = brand;
        this.model = model;
        this.maxWorkingCount = maxWorkingCount;
    }

    @Override
    public String toString() {
        return ram + "\n" + cpu + dataStorage +
                "Тип=" + type + ";" + "\n" +
                "Цена=" + cost + ";" + "\n" +
                "Бренд=" + brand + ";" + "\n" +
                "Модель=" + model + ";" + "\n" +
                "Максимальное количество включений - " + maxWorkingCount + ".";
    }

    public void on() {

        if (!(this.powerOn) && this.maxWorkingCount != 0) {
            System.out.println("Введите 0 или 1");
            if (SCANNER.nextInt() == Math.round(Math.random())) {
                this.powerOn = true;
                System.out.println("Компьютер включён");
            } else {
                this.maxWorkingCount = 0;
                System.out.println("Компьютер сгорел");
            }
        } else {
            System.out.println("Компьютер уже включен или сгорел");
        }
    }

    public void off() {

        if (this.powerOn) {
            System.out.println("Введите 0 или 1");
            if (SCANNER.nextInt() == Math.round(Math.random())) {
                this.powerOn = false;
                maxWorkingCount--;
                System.out.println(maxWorkingCount);
                System.out.println("Компьютер выключен");
            } else {
                this.maxWorkingCount = 0;
                System.out.println("Компьютер сгорел");
            }
        } else {
            System.out.println("Компьютер уже выключен или сгорел");
        }
    }
}