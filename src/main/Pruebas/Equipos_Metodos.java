import ModelosPrueba.Equipos;
import ModelosPrueba.Partidas;

import javax.persistence.*;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Equipos_Metodos {
    //Creamos el EM con el cual realizamos todas las operaciones
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("PruebaHTML");


    //Antes de añadir un equipo llamamos a el metodo getEquipo para comprobar si el equipo con ese ID existe.
    public static void addEquipos(int id,int codigo, String nombre,int tiempo,int idpartida) throws SQLException {
        //Comprobamos si  estos elementos existen
        boolean EquipoIdExiste = getEquipoById(id);
        boolean PartidaExiste = getPartidaById(idpartida);
        boolean EquipoCodigoExiste = getEquipoByCodigo(codigo);


        if(!EquipoIdExiste && PartidaExiste && !EquipoCodigoExiste) {
            //Si ambas condiciones son false

            // The EntityManager class allows operations such as create, read, update, delete
            EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
            // Used to issue transactions on the EntityManager
            EntityTransaction et = null;

            try {
                // Get transaction and start
                et = em.getTransaction();
                et.begin();

                // Create and set values for new customer
                Equipos equipos = new Equipos();
                equipos.setCodigo(codigo);
                equipos.setId(id);
                equipos.setNombre(nombre);
                equipos.setTiempo(tiempo);
                equipos.setIdPartida(idpartida);

                // Save the customer object
                em.persist(equipos);
                et.commit();
            } catch (RollbackException ex) {

                if (et != null) {
                    et.rollback();
                }
                ex.printStackTrace();
            } finally {
                // Close EntityManager
                em.close();
            }
        }
        else{
            if(EquipoIdExiste || EquipoCodigoExiste){
            throw new SQLDataException("Este equipo ya existe en la tabla equipos");
            }else {
                throw new SQLDataException("Esta partida no existe en las partidas guardadas, crea la partida primero");
            }




        }


    }
    public static boolean getEquipoById(int id) {
        boolean result = true;
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

        // the lowercase c refers to the object
        // :custID is a parameterized query thats value is set below
        String query = "SELECT c FROM Equipos c WHERE c.id = :id";

        // Issue the query and get a matching Customer
        TypedQuery<Equipos> tq = em.createQuery(query, Equipos.class);
        tq.setParameter("id", id);

        Equipos equipo = null;
        try {
            // Get matching customer object and output
            equipo = tq.getSingleResult();
        } catch (NoResultException ex) {
            result = false;
        } finally {
            em.close();
        }
        return result;
    }
    //Este metodo nos va decir si existe una partida
    public static boolean getPartidaById(int id){
        boolean result = true;
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

        // the lowercase c refers to the object
        // :id is a parameterized query thats value is set below
        String query = "SELECT c FROM Partidas c WHERE c.id = :id";

        // Issue the query and get a matching Customer
        TypedQuery<Partidas> tq = em.createQuery(query, Partidas.class);
        tq.setParameter("id", id);

        Partidas partida = null;
        try {
            // Get matching customer object and output
            partida = tq.getSingleResult();
        } catch (NoResultException ex) {
            result = false;
        } finally {
            em.close();
        }
        return result;
    }
    public static boolean getEquipoByCodigo(int codigo) {
        boolean result = true;
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

        // the lowercase c refers to the object
        // :custID is a parameterized query thats value is set below
        String query = "SELECT c FROM Equipos c WHERE c.codigo = :codigo";

        // Issue the query and get a matching Customer
        TypedQuery<Equipos> tq = em.createQuery(query, Equipos.class);
        tq.setParameter("codigo", codigo);

        Equipos equipo = null;
        try {
            // Get matching customer object and output
            equipo = tq.getSingleResult();
        } catch (NoResultException ex) {
            result = false;
        } finally {
            em.close();
        }
        return result;
    }


}
