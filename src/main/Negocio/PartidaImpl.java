package Negocio;

import Modelos.Juegos;
import Modelos.Partidas;
import Modelos.Usuarios;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Calendar;
import java.util.List;

@Stateless
public class PartidaImpl implements PartidaEJB {
    @PersistenceContext(unitName = "PruebaHTML")
    private EntityManager em;

    @Override
    public void guardarPartida(Integer codigo) {
        Partidas p = new Partidas();
        p.setId(codigo);
        p.setDuracion(0);
        p.setFechaCreacion(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        p.setFechaInicio(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        p.setUsername(buscarUsuarioUsername("enrique"));
        p.setIdJuego(buscarJuegoId(115));


        p.setNombre("Partida"+codigo.toString());

        em.persist(p);
    }

    @Override
    public Partidas ultimaPartida() {
        String jpql = "select p from Partidas p order by p.fechaCreacion desc ";
        Query q = em.createQuery(jpql);
        List<Partidas> partidas = q.getResultList();

        return (Partidas) q.getResultList().get(0);
    }

    @Override
    public Usuarios buscarUsuarioUsername(String username) {
        Query q = em.createQuery("select u from Usuarios u where u.username = :usuario");
        q.setParameter("usuario", username);
        if(q.getResultList().size() == 1) {
            return (Usuarios) q.getResultList().get(0);
        }
        return null;
    }
    @Override
    public Juegos buscarJuegoId(Integer id) {
        Query q = em.createQuery("select u from Juegos u where u.id = :id");
        q.setParameter("id", id);
        if(q.getResultList().size() == 1) {
            return (Juegos) q.getResultList().get(0);
        }
        return null;
    }

    @Override
    public List<Partidas> todasLasPartidas() {
        String jpql = "select p from Partidas p order by p.fechaCreacion desc";
        Query q = em.createQuery(jpql);
        return q.getResultList();
    }

}
