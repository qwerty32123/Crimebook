package Negocio;

import Modelos.Informacion;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless

public class InformacionImp implements InformacionEJB {
    @PersistenceContext(unitName = "PruebaHTML")
    private EntityManager em;

    @Override
    public Informacion getInformacion() {
        Query q = em.createQuery("select u from Informacion u where u.idCrimebook = '1'");
        if(q.getResultList().size() == 1) {
            return (Informacion) q.getResultList().get(0);
        }
        return null;
    }
}
