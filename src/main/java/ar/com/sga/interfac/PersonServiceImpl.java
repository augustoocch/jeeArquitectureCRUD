package ar.com.sga.interfac;

import ar.com.sga.datos.PersonaDao;
import ar.com.sga.domain.Persona;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PersonServiceImpl implements PersonServiceLocal{

    
    @Inject
    private PersonaDao personaDao;

    @Resource
    private SessionContext contexto;
    
    @Override
    public List<Persona> listarPersonas() {
         return personaDao.findAllPersons();
    }

    @Override
    public Persona encontrarId(Persona persona) {
        return personaDao.findPersonByID(persona);
    }

    @Override
    public Persona encontrarEmail(Persona persona) {
        return personaDao.findPersonByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
     personaDao.insertPerson(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
            try {
            personaDao.updatePerson(persona);
        } catch (Throwable t) {
            contexto.setRollbackOnly();
            t.printStackTrace(System.out);
        }
    }

    @Override
    public void eliminarPersona(Persona persona) {
          personaDao.deletePerson(persona);
    }
    
    
    
}
