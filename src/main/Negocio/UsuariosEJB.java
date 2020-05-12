package Negocio;

import javax.ejb.Local;

@Local

public interface UsuariosEJB {
    public Boolean login(String email, String contraseña);
    public  void registerUsuario(String username, String Apellidos,String contaseña,String email, String nombre);



}
