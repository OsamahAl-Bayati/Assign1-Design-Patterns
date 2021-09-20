public abstract class AbstractFactory {

    private String name;
    private double price;

    public AbstractFactory(String name) {
        this.name = name;
        this.price = 0;
    }

    public AbstractFactory(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AbstractFactory " + name + " $" + price;
    }
}
