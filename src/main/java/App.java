import java.net.Socket;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1, "Kitty", LocalDate.of(2020, 12, 12), "pet");
        System.out.println(cat1.getInfo());

        ArrayList<MansFriend> arrayAnimal = new ArrayList<>();

        AddAnimal.addSomePetAnimal(arrayAnimal, 2, "Aura", LocalDate.of(2018, 01, 22), "pet", 1);
        AddAnimal.addSomePetAnimal(arrayAnimal, 3, "Inga", LocalDate.of(2021, 03, 18), "pet", 2);
        AddAnimal.addSomePetAnimal(arrayAnimal, 4, "Benta", LocalDate.of(2022, 05, 03), "pet",3);
        AddAnimal.addSomePetAnimal(arrayAnimal, 5, "Roxy", LocalDate.of(2019, 02, 07), "pack",4);
        AddAnimal.addSomePetAnimal(arrayAnimal, 6, "Ava", LocalDate.of(2013, 05, 27), "pack",5);
        AddAnimal.addSomePetAnimal(arrayAnimal, 7, "Penny", LocalDate.of(2015, 10, 21), "pack",6);
        System.out.println("Введены данные по следующим животным:");
        AddAnimal.printList(arrayAnimal);

        ComandForAnimal.getHmpCom();



    }
}

