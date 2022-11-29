package ar.com.sga.datos;

import ar.com.sga.domain.Persona;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import javax.persistence.Query;
 
@Stateless
public class PersonaDaoImpl implements PersonaDao{
    @PersistenceContext (unitName = "PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersons() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonByID(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonByEmail(Persona persona) {
        Query query = em.createQuery("from Persona p where p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPerson(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePerson(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePerson(Persona persona) {
        em.remove(em.merge(persona));
    }

}
