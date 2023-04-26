import java.util.Date;

public abstract class MansFriend {
    int id;
    String name;
    Date bornDate;

    public MansFriend(int id, String name, Date bornDate) {
        this.id = id;
        this.name = name;
        this.bornDate = bornDate;
    }
}
