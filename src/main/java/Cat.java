import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Cat extends Pet {
    public Cat(int id, String name, LocalDate bornDate, String species, List<Integer> cm) {
        super(id, name, bornDate, species, cm);
    }

}
