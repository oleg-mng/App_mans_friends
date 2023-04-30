import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pet extends MansFriend{

    private String species;
    public List<Integer> cm;

    public Pet(int id, String name, LocalDate bornDate, String species, List<Integer> cm) {
        super(id, name, bornDate, cm);
        this.species = species;
        this.cm = cm;
    }

    public String getSpecies() {
        return species;
    }



    public List<Integer> getCm() {
        return cm;
    }


    @Override
    public String getInfo() {
        super.getInfo();
        return String.format("id: %d   name: %s   date: %s   species: %s  class: %s  commands: %s",
                id, name, bornDate, species, getClass().getSimpleName(), cm);
    }
}
