import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
    static int i = 1;

    public static void run(){
        ArrayList<MansFriend> arrayAnimal = new ArrayList<>();

        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Aura", LocalDate.of(2018, 01, 22), "pet", 1, new ArrayList<>(Arrays.asList(1, 2, 3)));
        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Inga", LocalDate.of(2021, 03, 18), "pet", 2, new ArrayList<>(Arrays.asList(3)));
        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Benta", LocalDate.of(2022, 05, 03), "pet", 3, new ArrayList<>(Arrays.asList(4, 3, 6)));
        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Roxy", LocalDate.of(2019, 02, 07), "pack", 4, new ArrayList<>(Arrays.asList(1)));
        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Ava", LocalDate.of(2013, 05, 27), "pack", 5, new ArrayList<>(Arrays.asList(5, 6)));
        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Penny", LocalDate.of(2015, 10, 21), "pack", 6, new ArrayList<>(Arrays.asList(3, 4)));
        AddAnimal.addSomePetAnimal(arrayAnimal, i++, "Lord", LocalDate.of(2018, 07, 07), "pack", 6, new ArrayList<>(Arrays.asList(4)));
        System.out.println("Введены данные по следующим животным:");
        AddAnimal.printList(arrayAnimal);

        ComandForAnimal.getHmpCom();

        View.getNewValue();
    }
}
