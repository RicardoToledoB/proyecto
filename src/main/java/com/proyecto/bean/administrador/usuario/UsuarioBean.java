package com.proyecto.bean.administrador.usuario;
import com.proyecto.model.Usuario;

import com.proyecto.service.UsuarioServiceImpl;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;

import javax.inject.Inject;
@Named(value = "usuarioBean")
@ViewScoped
public class UsuarioBean implements Serializable {
    private Usuario user;
    private List<Usuario> lista;
    private Usuario userEdit;
    private Usuario userDelete;
    private Usuario userView;
    @Inject
    private UsuarioServiceImpl uService;
    @PostConstruct
    public void init(){
        user=new Usuario();
        userEdit=new Usuario();
        userDelete=new Usuario();
        userView=new Usuario();
    }
    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public List<Usuario> getLista() {
        return uService.list();
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

    public Usuario getUserEdit() {
        return userEdit;
    }

    public void setUserEdit(Usuario userEdit) {
           this.userEdit = uService.find(userEdit);
    }

    public Usuario getUserDelete() {
        return userDelete;
    }

    public void setUserDelete(Usuario userDelete) {
        this.userDelete = uService.find(userDelete);
    }

    public Usuario getUserView() {
        return userView;
    }

    public void setUserView(Usuario userView) {
        this.userView = uService.find(userView);
    }
    
    
    
    public void delete(){
        uService.delete(userDelete);
    }
        
    public void edit(){
        uService.edit(userEdit);
        limpiar();
    }
    
    
    public void save(){
        user.setEstado("activo");
        uService.save(user);
        limpiar();
    }
    
    public void eliminar(){
        uService.delete(user);
    }
    
    public void limpiar(){
        user=new Usuario();
        userEdit=new Usuario();
    }
    
}
