import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;
import model.computer.Hdd;
import model.computer.Ram;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//        List<Laptop> computerList = new ArrayList<>();
//
//        computerList.add(new Laptop("Laptop1", "HP", new Hdd("HP", 50), new Ram("HP", 50), 100));
//        computerList.add(new Laptop("Laptop1", "HP", new Hdd("HP", 50), new Ram("HP", 50), 100));
//        computerList.add(new Laptop("Laptop1", "HP", new Hdd("HP", 50), new Ram("HP", 50), 55));
//        computerList.add(new Laptop("Laptop1", "HP", new Hdd("HP", 50), new Ram("HP", 50), 70));
//        computerList.add(new Laptop("Laptop2", "Dell", new Hdd("Dell", 50), new Ram("Dell", 50), 50));
//        computerList.add(new Laptop("Laptop3", "Dell", new Hdd("Dell", 50), new Ram("Dell", 50), 60));

//        System.out.println("---SET---");
//        Set<Laptop> computerBattery = new HashSet<>(computerList);
//        for (Laptop computersBattery : computerBattery) {
//            System.out.println(computersBattery.getBatteryLevel());
//        }
//
//        System.out.println("---SORT LISTA---");
//        List<Laptop> computerSort = new ArrayList<>(computerBattery);
//        Collections.sort(computerSort, Comparator.comparingInt(Laptop::getBatteryLevel));
//        for (Laptop computersSort : computerSort) {
//            System.out.println(computersSort.getBatteryLevel());

//        ZADANIE DOMOWE DO MODUŁU 11 STREAM

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("MB PRO 1", "PRO 1", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 2", "PRO 2", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 3", "PRO 3", new Hdd("HP", 256), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 4", "PRO 4", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new PC("PC 1", "BBA", new Hdd("HP", 500), new Ram("HP", 128)));
        computers.add(new PC("PC 1", "AAA", new Hdd("HP", 256), new Ram("HP", 256)));
        computers.add(new PC("PC 3", "PRO3", new Hdd("HP", 500), new Ram("HP", 128)));

////        1. Zliczyć wszystkie komputery, które mają więcej niż 128 gb ramu
//        System.out.println("---Zadanie 1 ---");
//        long count = computers.stream()
//                .filter(c -> c.getRam().getSize() > 128)
//                .count();
//        System.out.println(count);
//
////        2. Wyświetlić na konosle wszystkie typy komputerów - map
//        System.out.println("---Zadanie 2 ---");
//        computers.stream()
//                .map(Computer::getType)
//                .forEach(System.out::println);
//
////        3. Wyświetlić komputer, który ma najwięcej ramu
//        System.out.println("---Zadanie 3 ---");
//        Computer computer = computers.stream()
//                .max(Comparator.comparingInt(c -> c.getRam().getSize()))
//                .orElseThrow(() -> new IllegalStateException("Can not find any computer"));
//        System.out.println(computer.getName());
//
////        4. Utworzyć nową kolekcję z komputerami, któe mają dysk twardy mniejszy niż 500 gb
//        System.out.println("---Zadanie 4 ---");
//        List<Computer> newCollectList = computers.stream()
//                .filter(c -> c.getHdd().getSize() < 500)
//                .collect(Collectors.toList());
////        newCollectList.stream()
////                .forEach(System.out::println);
//        for (Computer newList : newCollectList) {
//            System.out.println(newList.getName() + " " + newList.getHdd());
//        }

//        5. Posortować komputery po nazwie i typie
        System.out.println("---Zadanie 5 ---");
        List<Computer> computerList = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());
        for (Computer sortedList : computerList) {
            System.out.println(sortedList.getName() + " " + sortedList.getType());
        }
    }
}
