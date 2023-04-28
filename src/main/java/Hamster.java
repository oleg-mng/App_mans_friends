import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Hamster extends Pet{

    public Hamster(int id, String name, LocalDate bornDate, String species, List<Integer> cm) {
        super(id, name, bornDate, species, cm);
    }
}
