import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Donkey extends PackAnimal{


    public Donkey(int id, String name, LocalDate bornDate, String species, ArrayList<Integer> cm) {
        super(id, name, bornDate, species, cm);
    }
}
