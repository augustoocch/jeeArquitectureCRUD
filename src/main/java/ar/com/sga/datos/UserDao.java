package ar.com.sga.datos;

import ar.com.sga.domain.Usuario;
import java.util.List;

public interface UserDao {
    
    
    public List <Usuario> lisAllUsers();
    
    public Usuario getUserById(Usuario user);
    
    public void updateUser (Usuario user);
    
    public void insertUser (Usuario user);
    
    public void deleteUser (Usuario user);
    
}
