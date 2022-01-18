package lesson3;

/**
 * В главном классе Main создавать компьютеры и работать с ними.
 * Методы:
 * 1)	включить, при включении может произойти сбой, при вызове метода
 * рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
 * угадали комп включается, если нет сгорает. Если комп сгорел, при попытке
 * включить нужно выдать сообщение что ему конец
 * 2)	выключить (аналогично включению)
 */
public class Main {
    public static void main(String[] args) {

        Ram ram = new Ram(1000, "DDR4");
        Cpu cpu = new Cpu(2500, 2, 5000);
        DataStorage dataStorage = new DataStorage("ssd", 1000, "Samsung");
        Computer computer = new Computer(ram, cpu, dataStorage, "Laptop", 1500, "Lenovo",
                "Best", 150);
        System.out.println(computer);
        computer.on();
        computer.off();
    }
}
