import java.time.LocalDate;
import java.util.*;

public class PackAnimal extends MansFriend{

    private String species;
    public ArrayList<Integer> cm;

    public PackAnimal(int id, String name, LocalDate bornDate, String species, ArrayList<Integer> cm) {
        super(id, name, bornDate,cm);
        this.species = species;
        this.cm = cm;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public List<Integer> getCm() {
        return cm;
    }
    @Override
    public String getInfo() {
        super.getInfo();
        return String.format("id: %d   name: %s   date: %s   species: %s  class: %s  commands: %s ",
                id, name, bornDate, species, getClass().getSimpleName(), cm);
    }
}
