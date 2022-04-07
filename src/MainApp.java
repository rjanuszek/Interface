import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;
import model.computer.Hdd;
import model.computer.Ram;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

//        Computer officeComputer1 = new PC("Office computer 1", "HP", 500, 128);
//        Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
//        Computer officeComputer3 = new PC("Office computer 3", "HP", 500, 128);
//        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);
//        Computer mackbook = new Laptop("MB PRO", "PRO", 500, 256, 100);
//
//        ((Laptop)gamingLaptop).playMusic();
//        ((Laptop)gamingLaptop).pauseMusic();
//        ((Laptop)gamingLaptop).stopMusic();
//        ((Laptop)gamingLaptop).sayHello();
//
//        ((Laptop)mackbook).playVideo();
//        ((Laptop)mackbook).pauseVideo();
//        ((Laptop)mackbook).stopVideo();
//        ((Laptop)gamingLaptop).sayHello();


        // TYPY OPAKOWUJĄCE
//        Byte b;
//        Short s;
//        Integer i;
//        Long l;
//        Float f;
//        Double d;
//        Character c;
//        Boolean bl;

//        int number = 10;

//        auto boxing
//        Integer intNumber = Integer.valueOf(10);
//        Integer intNumber = 10;

//        auto unboxing
//        int newNumber = intNumber.intValue();
//
//        Double dbl = Double.valueOf(3.10);
//        System.out.println(dbl);

//        TRZY NOWE METODY
//        User rafaela = new User("Rafaela", "Testowa", "test@wp.pl", 20);
//        User rafaela1 = new User("Rafaela1", "Testowa", "test@wp.pl", 20);
//        System.out.println(rafaela.equals(rafaela1));

//        KOMPOZYCJA

//        Hdd hdd = new Hdd ("Samsung", 500);
//        Ram ram = new Ram ("AAA", 280);

//        Computer officeComputer = new PC("Office computer 1", "HP", new Hdd ("Samsung", 500),
//                new Ram ("AAA", 280));
//        System.out.println(officeComputer.toString());
//        System.out.println(officeComputer.getHdd().getSize());
//    }

//        ZADANIE DOMOWE

//        BugReporter bugReporter = new BugReporter("Rafaela", "Januszek", "wp@com.pl");
//        Bug bug = new Bug("Test", bugReporter, 2);
//        System.out.println(bug);
//        bug.setBugStatus(true);
//        System.out.println(bug);
//    }

//        ĆWICZENIA Z KOLEKCJI

        List<Laptop> computerList = new ArrayList<>();

        computerList.add(new Laptop("Laptop1", "HP", new Hdd("HP", 50), new Ram("HP", 50), 100));
        computerList.add(new Laptop("Laptop1", "HP", new Hdd("HP", 50), new Ram("HP", 50), 100));
        computerList.add(new Laptop("Laptop1", "HP", new Hdd("HP", 50), new Ram("HP", 50), 55));
        computerList.add(new Laptop("Laptop1", "HP", new Hdd("HP", 50), new Ram("HP", 50), 70));
        computerList.add(new Laptop("Laptop2", "Dell", new Hdd("Dell", 50), new Ram("Dell", 50), 50));
        computerList.add(new Laptop("Laptop3", "Dell", new Hdd("Dell", 50), new Ram("Dell", 50), 60));

        System.out.println("---SET---");
        Set<Laptop> computerBattery = new HashSet<>(computerList);
        for (Laptop computersBattery : computerBattery) {
            System.out.println(computersBattery.getBatteryLevel());
        }

        System.out.println("---SORT LISTA---");
        List<Laptop> computerSort = new ArrayList<>(computerBattery);
        Collections.sort(computerSort, Comparator.comparingInt(Laptop::getBatteryLevel));
        for (Laptop computersSort : computerSort) {
            System.out.println(computersSort.getBatteryLevel());
        }
    }
}
