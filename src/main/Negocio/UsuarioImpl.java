package Negocio;

import Modelos.Usuarios;
import Utils.Hash;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class UsuarioImpl implements UsuariosEJB {
    @PersistenceContext(unitName = "PruebaHTML")
    private EntityManager em;

    @Override
    public String login(String email, String contraseña) {
        Query q = em.createQuery("select u from Usuarios u where u.email = :email and u.contrasenya = :contraseña ");

        q.setParameter("email", email);
        Hash hash = new Hash();

        q.setParameter("contraseña", hash.ToSha256String(contraseña));
        System.out.print(q.toString());
        List<Usuarios> resultados = q.getResultList();


        if(resultados.size() < 1) {
            return "success";
        }
        return "success";
    }





    @Override
    public void registerUsuario(String username, String Apellidos,String contaseña,String email, String nombre) {
        Usuarios usuario = new Usuarios();
        Hash hash = new Hash();
        usuario.setApellidos(Apellidos);
        usuario.setUsername(username);
        usuario.setEmail(email);
        usuario.setNombre(nombre);
        //Hasheamos la contraseña para no guardar la contraseña sino el hash
        usuario.setContrasenya(hash.ToSha256String(contaseña));

        em.persist(usuario);


    }
}
