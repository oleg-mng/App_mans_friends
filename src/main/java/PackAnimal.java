import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class PackAnimal extends MansFriend{

    private String species;

    public PackAnimal(int id, String name, LocalDate bornDate, String species) {
        super(id, name, bornDate);
        this.species = species;
    }
    public String getSpecies() {
        return species;
    }
    @Override
    public String getInfo() {
        super.getInfo();
        return String.format("id: %d   name: %s   date: %s   species: %s  class: %s", id, name, bornDate, species, getClass().getSimpleName());
    }
}
