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
            ArrayList<MansFriend> dl = AddAnimal.addSomePetAnimal(Controller.choice(), i, "Reta",
                    LocalDate.of(2013, 4, 4), "pack", 5,
                    new ArrayList<>(Arrays.asList(6, 7)));
            System.out.println("Новый питомец id=" + i +" добавлен. Данные сохранены в файл add.txt");
            System.out.println("Технология try-with-resources применена");
            AddAnimal.printList(dl);
            for (MansFriend packAnimal : dl) {
                writer.println(packAnimal.getInfo());
            }

        } catch (IOException e){
            System.out.println("Нужно немного подождать/исправить");
        }

//        try (Scanner in = new Scanner(new File("testRead.txt"));
//             PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
//            while (scanner.hasNext()) {
//                writer.print(scanner.nextLine());
//            }
//        }

    }
}
