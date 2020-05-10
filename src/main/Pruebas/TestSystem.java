import javax.persistence.*;
import java.util.List;

public class TestSystem {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PruebaHTML");
    public static void main(String[] args) {
        System.out.print("Funciona");
        entityManagerFactory.close();

    }
    public static void addcustomer(int id, String fname, String lname){
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = null;
        try{
            et = em.getTransaction();
            et.begin();
            Customer cost = new Customer();
            cost.setId(id);
            cost.setfName(fname);
            cost.setlName(lname);
            em.persist(cost);
            et.commit();
        }
        catch (Exception ex){
            if(et !=null){
                et.rollback();
            }
            ex.printStackTrace();
        }
        finally {
            em.close();
        }
    }
    public static void getcustomerz(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        String query = "Select c from Customer c where c.id = :custID";

        TypedQuery<Customer> tq =em.createQuery(query,Customer.class);
        tq.setParameter("custID",id);
        Customer cust = null;
        try{
            cust = tq.getSingleResult();
            System.out.println(cust.getfName() + " " + cust.getfName());
        }
        catch (NoResultException ex ){
            ex.printStackTrace();
        }
        finally {
            em.close();
        }
    }
    public static void getcustomers(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        String strQuery = "Select c from Customer c where c.id is not null";
        TypedQuery<Customer> tq =em.createQuery(strQuery,Customer.class);
        List<Customer> custs;
        try{
            custs = tq.getResultList();
            custs.forEach(cust->System.out.println(cust.getfName() + " " + cust.getlName()));
        }
        catch (NoResultException ex ){
            ex.printStackTrace();
        }
        finally {
            em.close();
        }

    }


    }


