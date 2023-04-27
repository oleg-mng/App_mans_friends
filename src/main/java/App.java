import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1, "Kitty", LocalDate.of(2020, 12, 12), "Pet");
        System.out.println(cat1.getInfo());

        ArrayList<Pet> arrayAnimal = new ArrayList<>();
//        System.out.println(cat1.getPlace());

        AddAnimal.addSomePetAnimal(arrayAnimal, 4, "Kukish", LocalDate.of(2018, 01, 11));
        AddAnimal.printList(arrayAnimal);


    }
}


//        ArrayList<Cat> catBasket = new ArrayList<>();
////        (catBasket, 701, "Doll", 1, 10);
//        cat1.addNewAnimal(1, "Stepan", LocalDate.of(2021,01,23));


