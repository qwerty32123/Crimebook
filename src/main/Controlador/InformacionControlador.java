package Controlador;

import Modelos.Informacion;
import Negocio.InformacionEJB;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value ="InfoCtrl")
@RequestScoped
public class InformacionControlador {
    @EJB
    private InformacionEJB informacionEJB;




    private Integer idCrimebook;
    private Informacion Desc;
    private String CambiarPagina;
    public String getCambiarpagina() {
        FacesContext fc = FacesContext.getCurrentInstance();
        ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler)fc.getApplication().getNavigationHandler();
        nav.performNavigation("pagina3.jsp");
        return null;
    }

    public void setCambiarpagina(String cambiarpagina) {
        FacesContext fc = FacesContext.getCurrentInstance();
        ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler)fc.getApplication().getNavigationHandler();
        nav.performNavigation("pagina3.jsp");
    }

    private String cambiarpagina;

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
