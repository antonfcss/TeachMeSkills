package lesson3;

public class DataStorage {
    String type;
    int capacity;
    String brand;

    public DataStorage(String type, int capacity, String brand){
        this.type = type;
        this.capacity = capacity;
        this.brand = brand;
    }

    public String toString(){
        return "Накопитель\n" + " Тип - " + this.type + ";\n" + " Размер - " +
                this.capacity + ";" + "\n" + " Бренд - " + this.brand + ";" + "\n";
    }
}
