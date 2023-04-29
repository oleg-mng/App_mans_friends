import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class CounterL {
    public static void add() {
        int i = 99;
        System.out.println("CounterL");
        try (PrintWriter writer = new PrintWriter(new File("add.txt"))){
            i++;
            Controller.choice();
            ArrayList<PackAnimal> dl = AddAnimal.addSomePetAnimal(Controller.choice(), i, "Reta",
                    LocalDate.of(2013, 04, 04), "pack", 5,
                    new ArrayList<>(Arrays.asList(6, 7)));
            System.out.println("Новое животное добавлено:");
            AddAnimal.printList(dl);
            for (PackAnimal packAnimal : dl) {
                writer.println(packAnimal.getInfo());
            }

        } catch (IOException e){
            System.out.println("Нужно немного исправить");
        }

    }
}
