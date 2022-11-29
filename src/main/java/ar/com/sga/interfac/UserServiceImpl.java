package ar.com.sga.interfac;

import ar.com.sga.datos.UserDao;
import ar.com.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class UserServiceImpl implements UserServiceLocal {

    
    @Inject UserDao userDao;
    EntityManager em;
    
    @Override
    public List<Usuario> listUsers() {
        
        
        return userDao.lisAllUsers();
    }

    @Override
    public Usuario userFindId(Usuario user) {
        
        return userDao.getUserById(user);
    }

    @Override
    public void registrarUser(Usuario user) {
        
        userDao.insertUser(user);
    }

    @Override
    public void modificarUser(Usuario user) {
        
        userDao.updateUser(user);
    }

    @Override
    public void eliminarUser(Usuario user) {
        
        userDao.deleteUser(user);
    }
    
}
