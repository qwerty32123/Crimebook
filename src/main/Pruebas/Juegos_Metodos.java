import ModelosPrueba.Juegos;
import ModelosPrueba.Usuarios;

import javax.persistence.*;
import java.sql.SQLDataException;
import java.util.Calendar;

public class Juegos_Metodos {
    //Creamos el EM con el cual realizamos todas las operaciones
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("PruebaHTML");

    public static void main(String[] args) throws SQLDataException {
        addJuego(255,"Los gladiadores de gato","Gladiadores luchan!!","Luchan GLad","ivantapia01");
    }
    public static void addJuego(int id, String nombre, String descExtendida, String  descBreve, String username) throws SQLDataException {
        //Comprobamos si  estos elementos existen
        boolean juegoExiste = getJuegoById(id);
        boolean usuarioExiste = getUsuarioByUsername(username);
        if (!juegoExiste && usuarioExiste) {


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
                Juegos juego = new Juegos();
                juego.setId(id);
                juego.setDescBreve(descBreve);
                juego.setDescExtendida(descExtendida);
                //current date
                java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                juego.setFechaCreacion(date);
                juego.setUsername(username);
                juego.setNombre(nombre);


                // Save the customer object
                em.persist(juego);
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


                }else{
            if(!usuarioExiste){
                throw new SQLDataException("Este usuario no existe en la tabla usuarios");

            }else {
                throw new SQLDataException("Este Juego ya  existe en la tabla de Juegos");
            }


        }
    }


    public static boolean getJuegoById(int id) {
        boolean result = true;
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

        // the lowercase c refers to the object
        // :custID is a parameterized query thats value is set below
        String query = "SELECT c FROM Juegos c WHERE c.id = :custID";

        // Issue the query and get a matching Customer
        TypedQuery<Juegos> tq = em.createQuery(query, Juegos.class);
        tq.setParameter("custID", id);

        Juegos cust = null;
        try {
            // Get matching customer object and output
            cust = tq.getSingleResult();
        }
        catch(NoResultException ex) {
            result = false;
        }
        finally {
            em.close();

        }
        return result;
    }

    public static boolean getUsuarioByUsername(String usuario) {
        boolean result = true;
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

        // the lowercase c refers to the object
        // :custID is a parameterized query thats value is set below
        String query = "SELECT c FROM Usuarios c WHERE c.username = :usuario";

        // Issue the query and get a matching Customer
        TypedQuery<Usuarios> tq = em.createQuery(query, Usuarios.class);
        tq.setParameter("usuario", usuario);

        Usuarios cust = null;
        try {
            // Get matching customer object and output
            cust = tq.getSingleResult();
        }
        catch(NoResultException ex) {
            result = false;
        }
        finally {
            em.close();

        }
        return result;
    }


}
