import java.util.List;

public class Taxi extends Car{
    List<Person> people;
    public Taxi(String name, String color, short price, short maxGuest,char typeCar, List<Person> people) {
        super(name, color, price, maxGuest,typeCar);
        this.people = people;
    }

    public Taxi() {
    }

    @Override
    public void stop() {
        int a = people.size();
        if (a != 4){
            System.out.println("Stop");
        }else {
            System.out.println("There are no seats");
        }
    }

    @Override
    public String toString() {
        return "\nTaxi: " + super.toString() +
                "\n" + people;
    }
}
