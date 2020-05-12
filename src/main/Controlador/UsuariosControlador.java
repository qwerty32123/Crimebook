package Controlador;

import Negocio.UsuariosEJB;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value ="UsuarioCtrl")
@RequestScoped
public class UsuariosControlador {
    @EJB
    private UsuariosEJB usuariosEJB;

    private String username;
    private String apellidos;
    private String contraseña;
    private String email;
    private String nombre;
    private String showInfo;

    public String getShowInfo() {
        return showInfo;
    }

    public void setShowInfo(String showInfo) {
        usuariosEJB.registerUsuario(username,apellidos,contraseña,email,nombre);
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
