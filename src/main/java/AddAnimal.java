import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AddAnimal {
    private static String species;

    public static ArrayList<Pet> addSomePetAnimal(List<Pet> arrayAnimal, int id, String name, LocalDate bornDate) {

        arrayAnimal.add(new Pet(id, name, bornDate, species));
        return (ArrayList<Pet>) arrayAnimal;
    }
    public static void printList(List<Pet> arrayAnimal) {
        for (Pet pet : arrayAnimal) {
            System.out.println(pet.getInfo());
        }
    }
}

//    public void addNewAnimal(int id, String name, LocalDate bornDate) {
//
//        MansFriend anyAnimal = new MansFriend(id, name, bornDate) {
//            @Override
//            public void addNewAnimal(int id, String name, LocalDate bornDate) {
//                super.addNewAnimal(id, name, bornDate);
//            }
//        };
//        System.out.println(anyAnimal.getInfo());
//    }
