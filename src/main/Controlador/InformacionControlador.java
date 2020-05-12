package Controlador;

import Modelos.Informacion;
import Negocio.InformacionEJB;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value ="InfoCtrl")
@RequestScoped
public class InformacionControlador {
    @EJB
    private InformacionEJB informacionEJB;


    private Integer idCrimebook;
    private Informacion Desc;

    public Integer getIdCrimebook() {
        return idCrimebook;
    }

    public void setIdCrimebook(Integer idCrimebook) {
        this.idCrimebook = idCrimebook;
    }

    public Informacion getDesc() {
        return informacionEJB.getInformacion();
    }

    public void setDesc(Informacion desc) {
        Desc = desc;
    }
}
