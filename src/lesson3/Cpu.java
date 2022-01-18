package lesson3;

public class Cpu {
    int clockspeed;//Тактовая частота
    int coreCount; //Количество ядер
    int casheSize; //Размер кэша

    public Cpu(int clockspeed, int coreCount, int casheSize) {
        this.clockspeed = clockspeed;
        this.coreCount = coreCount;
        this.casheSize = casheSize;
    }

    public String toString() {
        return "CPU" + "\n" + " Тактовая частота -" + this.clockspeed + ";" + "\n" + " Количество ядер - " + this.coreCount +
                ";" + "\n" + " Размер кэша -" + this.casheSize + ";" + "\n";
    }
}
