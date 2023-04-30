import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public abstract class MansFriend {
    int id;
    String name;
    LocalDate bornDate;
    public List<Integer> cm;

    public MansFriend(int id, String name, LocalDate bornDate, List<Integer> cm) {
        this.id = id;
        this.name = name;
        this.bornDate = bornDate;
        this.cm = cm;
    }
    public MansFriend() {

    }
    public List<Integer> getCm() {
        return cm;
    }

    public String getInfo() {
        return String.format("id: %d   name: %s   date: %s", id, name, bornDate);
    }
}
