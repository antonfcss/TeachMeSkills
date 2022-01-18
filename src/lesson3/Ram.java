package lesson3;

public class Ram {
    int capacity;
    String type;

    public Ram(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public String toString() {
        return "RAM\n" + " Объем памяти - " + this.capacity + ";\n" + " тип - " + this.type + ";";
    }
}
