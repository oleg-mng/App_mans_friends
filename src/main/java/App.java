import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1, "Kitty", LocalDate.of(2020, 12, 12), "pet");
        System.out.println(cat1.getInfo());

        ArrayList<MansFriend> arrayAnimal = new ArrayList<>();

        AddAnimal.addSomePetAnimal(arrayAnimal, 2, "Aura", LocalDate.of(2018, 01, 22), "pet", 1);
        AddAnimal.addSomePetAnimal(arrayAnimal, 3, "Inga", LocalDate.of(2021, 03, 18), "pack", 6);
        AddAnimal.addSomePetAnimal(arrayAnimal, 4, "Benta", LocalDate.of(2017, 07, 29), "pack",7);
        AddAnimal.printList(arrayAnimal);

    }
}

