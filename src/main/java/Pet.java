import java.time.LocalDate;
import java.util.Date;

public class Pet extends MansFriend{

    private String place;

    public Pet(int id, String name, LocalDate bornDate, String place) {
        super(id, name, bornDate);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String getInfo() {
        super.getInfo();
        return String.format("id: %d   name: %s   date: %s   place: %s", id, name, bornDate, place);
    }
}
