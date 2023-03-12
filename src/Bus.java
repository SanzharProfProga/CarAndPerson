import java.util.List;

public class Bus extends Car{
    List<Person> people;
    public Bus(String name, String color, short price, short maxGuest,char typeCar,List<Person> people) {
        super(name, color, price, maxGuest,typeCar);
        this.people = people;
    }

    public Bus() {
    }

    @Override
    public void stop() {
        if (people.size() != 20){
            System.out.println("Stop");
        }else {
            System.out.println("There are no seats");
        }
    }

    @Override
    public String toString() {
        return "\nBus: " + super.toString() +
                "\n" + people;
    }
}
