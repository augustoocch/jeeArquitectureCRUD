package ar.com.sga.datos;

import ar.com.sga.domain.Persona;
import java.util.List;
import javax.enterprise.context.RequestScoped;


public interface PersonaDao {

    public List<Persona> findAllPersons ();

    public Persona findPersonByID(Persona persona);

    public Persona findPersonByEmail(Persona persona);

    public void insertPerson(Persona persona);

    public void updatePerson(Persona persona);

    public void deletePerson (Persona persona);
}
