import java.util.List;

public abstract class Car {
    private String name;
    private String color;
    private short price;
    private short maxGuest;
    private List<Person> people;

    public Car(String name, String color, short price, short maxGuest, List<Person> people) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.maxGuest = maxGuest;
        this.people = people;
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

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public abstract void stop();

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nColor: " + color +
                "\nPrice: " + price +
                "\nMax guest: " + maxGuest;
    }
}
