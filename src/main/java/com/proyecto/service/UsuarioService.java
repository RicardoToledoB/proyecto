package com.proyecto.service;
import com.proyecto.model.Usuario;
import java.util.List;
public interface UsuarioService {
    public void save(Usuario u);
    public void delete(Usuario u);
    public void edit(Usuario u);
    public List<Usuario> list();
    public Usuario find(Usuario u);
    
}
