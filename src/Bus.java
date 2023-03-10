import java.util.List;

public class Bus extends Car{
    public Bus(String name, String color, short price, short maxGuest, List<Person> people) {
        super(name, color, price, maxGuest, people);
    }

    public Bus() {
    }

    @Override
    public void stop() {
        if (getPeople().size() != 20){
            System.out.println("Stop");
        }else {
            System.out.println("There are no seats");
        }
    }

    @Override
    public String toString() {
        return "\nBus: " + super.toString();
    }
}
