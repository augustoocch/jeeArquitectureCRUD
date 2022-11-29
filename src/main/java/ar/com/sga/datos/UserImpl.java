package ar.com.sga.datos;

import ar.com.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class UserImpl implements UserDao {
    @PersistenceContext(unitName = "PersonaPU")
    EntityManager em;
    
    
    
    @Override
    public List<Usuario> lisAllUsers() {
        
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario getUserById(Usuario user) {
        
        return em.find(Usuario.class, user.getIdUsuario());
    }


    @Override
    public void updateUser(Usuario user) {
        
        em.merge(user);
       
    }

    @Override
    public void insertUser(Usuario user) {
        
        em.persist(user);
    }

    @Override
    public void deleteUser(Usuario user) {
        
        em.remove(em.merge(user));
    }
    
}
