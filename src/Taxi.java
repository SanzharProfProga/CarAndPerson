import java.util.List;

public class Taxi extends Car{
    public Taxi(String name, String color, short price, short maxGuest, List<Person> people) {
        super(name, color, price, maxGuest, people);
    }

    public Taxi() {
    }

    @Override
    public void stop() {
        int a = getPeople().size();
        if (a != 4){
            System.out.println("Stop");
        }else {
            System.out.println("There are no seats");
        }
    }

    @Override
    public String toString() {
        return "\nTaxi: " + super.toString();
    }
}
