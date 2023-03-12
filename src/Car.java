import java.util.List;

public abstract class Car {
    private String name;
    private String color;
    private short price;
    private short maxGuest;
    private char typeCar;


    public Car(String name, String color, short price, short maxGuest,char typeCar) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.maxGuest = maxGuest;
        this.typeCar = typeCar;

    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }

    public short getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(short maxGuest) {
        this.maxGuest = maxGuest;
    }

    public char getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(char typeCar) {
        this.typeCar = typeCar;
    }

    public abstract void stop();

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nColor: " + color +
                "\nPrice: " + price +
                "\nMax guest: " + maxGuest +
                "\nType: " + typeCar;
    }
}
