import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Dog extends Pet{

    public Dog(int id, String name, LocalDate bornDate, String species, List<Integer> cm) {
        super(id, name, bornDate, species, cm);
    }
}
