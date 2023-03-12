import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*.Car деген абстракт класс тузунуз поляларын толтурунуз.(name, color, maxGuest, price)
        public abstract void stop() бул метод машинада места барбы ошону
        текшеруучу метод болот эгер стоп методун иштетсек эгер места бар болсо токтоду деп чыгат
        места жок болсо места жок деп чыгат. sub класстар реализация кылат ушул методду
        2.Person класс тузунуз полелерин озунуз жазыныз
        3.Car классын мурастаган 2 класс тузунуз.
        Bus(private List<Person> people)   max people 20
        Taxi(private List<Person> client). max people 4
        4.StopAble деген interface ачыныз.
        1-баардык машиналарды кайтаруучу метод жазыныз!
        2-Ошол машинанын атын жазсак ошондо отурган адамдарды чыгарып беруучу метод жазыныз.
        3-Машинанын аты менен тапчуу метод жазыныз.
        5.StopAble интерфейсин StopAbleImpl деген
        класс implements кылсын жана логикасын ошол класста жазыныз.
        6.Баардык методдорду Main класста иштетиниз.*/


        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Nurik", (byte) 19, Gender.MALE),
                new Person("Davran", (byte) 17, Gender.MALE),
                new Person("Ilim", (byte) 20, Gender.MALE),
                new Person("Dastan", (byte) 19, Gender.MALE),
                new Person("Tahir", (byte) 30, Gender.MALE),
                new Person("Nurzhamal", (byte) 30, Gender.FEMALE),
                new Person("Samara", (byte) 41, Gender.FEMALE),
                new Person("Aimona", (byte) 17, Gender.FEMALE)));
        Bus bus = new Bus("36", "Blue and White", (short) 11, (short) 30, 'B', people);

        List<Person> person1 = new ArrayList<>(Arrays.asList(
                new Person("Sanzhar", (byte) 19, Gender.MALE),
                new Person("Das", (byte) 18, Gender.MALE),
                new Person("Santos", (byte) 25, Gender.MALE),
                new Person("Santos", (byte) 25, Gender.MALE)));
        Taxi taxi = new Taxi("Yandex", "Blak", (short) 100, (short) 4, 'T', person1);
        List<Car> cars = new ArrayList<>(Arrays.asList(bus, taxi));
        StopAbleImp stopAbleImp = new StopAbleImp();


        boolean isTrue = false;
        while (!isTrue) {
            System.out.println("""
                    1. Get cars
                    2. Info car
                    3. Name car
                    4. Stop taxi
                    5. Stop bus
                    0. End program
                    """);
            int a = new Scanner(System.in).nextInt();
            switch (a) {
                case 1 -> stopAbleImp.getTransport(cars);
                case 2 -> stopAbleImp.getPeopleTransport(cars);
                case 3 -> stopAbleImp.getNameTransport(cars);
                case 4 -> taxi.stop();
                case 5 -> bus.stop();
                case 0 -> isTrue = true;
            }
        }
    }
}