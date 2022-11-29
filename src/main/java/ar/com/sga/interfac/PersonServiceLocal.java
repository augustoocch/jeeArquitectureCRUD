package ar.com.sga.interfac;

import ar.com.sga.domain.Persona;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PersonServiceLocal {
    

    public List<Persona> listarPersonas ();

    public Persona encontrarId (Persona persona);

    public Persona encontrarEmail (Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona (Persona persona);

    public void eliminarPersona (Persona persona);
    
}