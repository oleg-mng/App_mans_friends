import java.time.LocalDate;

public class Pet extends MansFriend{

    private String species;

    public Pet(int id, String name, LocalDate bornDate, String species) {
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
