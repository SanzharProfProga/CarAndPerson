import java.util.List;
import java.util.Scanner;

public class StopAbleImp implements StopAble {


    @Override
    public void getTransport(List<Car> cars) {
        for (Car c : cars) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void getPeopleTransport(List<Car> cars) {
        String nameTrue = "";
        boolean isTrue = true;
        while (isTrue) {
            try {
                String name = new Scanner(System.in).nextLine().toUpperCase();
                for (Car c : cars) {
                    if (c.getName().toUpperCase().equals(name)) {
                        nameTrue = name;
                        isTrue = false;
                    } else {
                        throw new CheckName("Введенный вами запрос не правильно");
                    }
                }
            } catch (CheckName e) {
                System.out.println(e.getMessage());
            }
        }

        for (Car c : cars) {
            if (c.getName().toUpperCase().equals(nameTrue)) {
                for (Person p : c.getPeople()) {
                    System.out.println(p.toString());
                }
            }
        }
    }


    @Override
    public void getNameTransport(List<Car> cars) {
        boolean isTrue = true;
        while (isTrue) {
            try {
                String nameIsTrue = null;
                String name = new Scanner(System.in).nextLine().toUpperCase();
                for (Car c : cars) {
                    if (c.getName().toUpperCase().equals(name)) {
                        nameIsTrue = name;
                        isTrue = false;
                        break;
                    }
                }
                if (nameIsTrue != null) {
                    for (Car c : cars) {
                        if (c.getName().toUpperCase().equals(nameIsTrue)) {
                            System.out.println(c.toString());
                        }
                    }
                } else {
                    throw new CheckName("Введенный вами запрос не правильно");
                }
            } catch (CheckName e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
