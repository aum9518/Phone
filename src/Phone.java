public class Phone {
    String brand;
    String version;
    double screen;
    int memory;
    int price;

    public Phone(String brand, String version, double screen) {
        this.brand = brand;
        this.version = version;
        this.screen = screen;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void minMax(){

    }
}
