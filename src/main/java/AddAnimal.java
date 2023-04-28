import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAnimal {

    public static ArrayList<MansFriend> addSomePetAnimal(List<MansFriend> arrayAnimal, int id, String name,
                                                         LocalDate bornDate, String species, int numberAnimal, ArrayList<Integer> cm) {

//        cm = new ArrayList<>();
//        for (Integer integer : cm) {
//            cm.add(integer);
//        }
//        System.out.println(Arrays.toString(cm));


        if (species == "pet" && numberAnimal == 1) arrayAnimal.add(new Cat(id, name, bornDate, species, cm));
        else if (species == "pet" && numberAnimal == 2) arrayAnimal.add(new Dog(id, name, bornDate, species, cm));
        else if (species == "pet" && numberAnimal == 3) arrayAnimal.add(new Hamster(id, name, bornDate, species, cm));
        else if (species == "pack" && numberAnimal == 4) arrayAnimal.add(new Horse(id, name, bornDate, species, cm));
        else if (species == "pack" && numberAnimal == 5) arrayAnimal.add(new Camel(id, name, bornDate, species, cm));
        else if (species == "pack" && numberAnimal == 6) arrayAnimal.add(new Donkey(id, name, bornDate, species, cm));
        else {
            System.out.println(id +"=id, по данному животному введите корректные параметры species: 'pet' или 'pack' и numberAnimal: 1...6");
        }

        return (ArrayList<MansFriend>) arrayAnimal;
    }
    public static void printList(List<MansFriend> arrayAnimal) {
        for (MansFriend animal : arrayAnimal) {
            System.out.println(animal.getInfo());
        }
    }
//    public static void printAnimal(List<MansFriend> arrayAnimal, int study) {
//        for (MansFriend animal : arrayAnimal) {
//            if (animal.id == study) System.out.println(animal.getInfo());
//        }
//    }
}

