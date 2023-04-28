import java.net.Socket;
import java.time.LocalDate;
import java.util.*;

public class App {
    static int i = 1;

    public static void main(String[] args) {
//        Cat cat1 = new Cat(1, "Kitty", LocalDate.of(2020, 12, 12), "pet", (1, 2, 3));
//        System.out.println(cat1.getInfo());

        ArrayList<MansFriend> arrayAnimal = new ArrayList<>();

        ArrayList<Integer> listOfComand = new ArrayList<>();


        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Aura", LocalDate.of(2018, 01, 22), "pet", 1, new ArrayList<>(Arrays.asList(1, 2, 3)));

        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Inga", LocalDate.of(2021, 03, 18), "pet", 2, new ArrayList<>(Arrays.asList(3)));
        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Benta", LocalDate.of(2022, 05, 03), "pet", 3, new ArrayList<>(Arrays.asList(5, 6)));
        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Roxy", LocalDate.of(2019, 02, 07), "pack", 4, listOfComand);
        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Ava", LocalDate.of(2013, 05, 27), "pack", 5, listOfComand);
        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Penny", LocalDate.of(2015, 10, 21), "pack", 6, listOfComand);
        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Lord", LocalDate.of(2018, 07, 07), "pack", 6, listOfComand);
        System.out.println("Введены данные по следующим животным:");
        AddAnimal.printList(arrayAnimal);

        /**
         *
         */
        View.getNewValue();

//        ComandForAnimal.addComandInMap(i++, View.getNewValue());
//        ComandForAnimal.getHmpCom();

//        System.out.println(View.getNumber());

    }
}

