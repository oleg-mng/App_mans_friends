import java.time.LocalDate;
import java.util.Date;

public abstract class MansFriend {
    int id;
    String name;
    LocalDate bornDate;

    public MansFriend(int id, String name, LocalDate bornDate) {
        this.id = id;
        this.name = name;
        this.bornDate = bornDate;
    }
    public MansFriend() {

    }

    public String getInfo() {
        return String.format("id: %d   name: %s   date: %s", id, name, bornDate);
    }
}
