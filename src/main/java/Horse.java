import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Horse extends PackAnimal{


    public Horse(int id, String name, LocalDate bornDate, String species, ArrayList<Integer> cm) {
        super(id, name, bornDate, species, cm);
    }
}
