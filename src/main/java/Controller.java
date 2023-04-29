import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
//    static int i = 1;

    public static ArrayList<PackAnimal> run() {
        ArrayList<PackAnimal> arrayAnimal = new ArrayList<>();

        AddAnimal.addSomePetAnimal(arrayAnimal, 1, "Aura", LocalDate.of(2018, 01, 22), "pack", 5, new ArrayList<>(Arrays.asList(1, 2, 3)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 2, "Inga", LocalDate.of(2021, 03, 18), "pack", 5, new ArrayList<>(Arrays.asList(3)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 3, "Benta", LocalDate.of(2022, 05, 03), "pack", 5, new ArrayList<>(Arrays.asList(4, 3, 6)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 4, "Roxy", LocalDate.of(2019, 02, 07), "pack", 5, new ArrayList<>(Arrays.asList(1)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 5, "Ava", LocalDate.of(2013, 05, 27), "pack", 5, new ArrayList<>(Arrays.asList(5, 6)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 6, "Penny", LocalDate.of(2015, 10, 21), "pack", 5, new ArrayList<>(Arrays.asList(3, 4)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 7, "Lord", LocalDate.of(2018, 07, 07), "pack", 5, new ArrayList<>(Arrays.asList(4)));
        System.out.println("Введены данные по следующим животным:");
        AddAnimal.printList(arrayAnimal);

        ComandForAnimal.getHmpCom();

        View.getNewValue();
        return arrayAnimal;
    }

    public static void searchAnimalOnId(ArrayList<PackAnimal> arrayAnimal, int study) {
        for (PackAnimal animal : arrayAnimal) {
            if (animal.id == study) System.out.println(animal.getInfo());
        }
    }
    public static void searchAndAddCommand(ArrayList<PackAnimal> arrayAnimal, int study, int comm) {
        for (PackAnimal animal : arrayAnimal) {
            if (animal.id == study) {
                animal.cm.add(comm);
                System.out.println("Новая команда добавлена. Животное обучено.");
                System.out.println(animal.getInfo());

            }
        }
    }

    public static ArrayList<PackAnimal> choice() {
        ArrayList<PackAnimal> arrayAnimal = new ArrayList<>();

        AddAnimal.addSomePetAnimal(arrayAnimal, 1, "Aura", LocalDate.of(2018, 01, 22), "pack", 5, new ArrayList<>(Arrays.asList(1, 2, 3)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 2, "Inga", LocalDate.of(2021, 03, 18), "pack", 5, new ArrayList<>(Arrays.asList(3)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 3, "Benta", LocalDate.of(2022, 05, 03), "pack", 5, new ArrayList<>(Arrays.asList(4, 3, 6)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 4, "Roxy", LocalDate.of(2019, 02, 07), "pack", 5, new ArrayList<>(Arrays.asList(1)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 5, "Ava", LocalDate.of(2013, 05, 27), "pack", 5, new ArrayList<>(Arrays.asList(5, 6)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 6, "Penny", LocalDate.of(2015, 10, 21), "pack", 5, new ArrayList<>(Arrays.asList(3, 4)));
        AddAnimal.addSomePetAnimal(arrayAnimal, 7, "Lord", LocalDate.of(2018, 07, 07), "pack", 5, new ArrayList<>(Arrays.asList(4)));

        return arrayAnimal;
    }

}
