import java.time.LocalDate;
import java.util.Date;

public abstract class MansFriend {
    int id;
    String name;
//    Date bornDate;
    LocalDate bornDate;

    public MansFriend(int id, String name, LocalDate bornDate) {
        this.id = id;
        this.name = name;
        this.bornDate = bornDate;
    }
    public static void addNewAnimal(int id, String name, LocalDate bornDate) {
//        System.out.println("Get add new toy...");
        Cat cat = new Cat(id, name, bornDate);
        System.out.println(cat.getInfo());
    }
    public String getInfo() {
        return String.format("id: %d   name: %s   name: %d  ", id, name.getClass().getSimpleName());
    }
}
