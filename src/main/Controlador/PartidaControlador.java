package Controlador;

import Modelos.Partidas;
import Negocio.PartidaEJB;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;

@Named(value = "partidaCtrl")
@RequestScoped
public class PartidaControlador {
    @EJB
    private PartidaEJB partidaEJB;

    private Integer codigo;
    private Partidas ultimoGuardado;
    private List<Partidas> partidas;
    private Integer ultimoCodigo;

    public Integer getUltimoCodigo() {
        return ultimoCodigo;
    }

    public void setUltimoCodigo(Integer ultimoCodigo) {
        this.ultimoCodigo = ultimoCodigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String toPagina2(){
        partidaEJB.guardarPartida(codigo);
        return "pagina2.xhtml?faces-redirect=true&codigo="+codigo;

    }

    public Partidas getUltimoGuardado() {
        return partidaEJB.ultimaPartida();
    }

    public void setUltimoGuardado(Partidas ultimoGuardado) {
        this.ultimoGuardado = ultimoGuardado;
    }

    public List<Partidas> getPartidas() {
        return partidaEJB.todasLasPartidas();
    }

    public void setPartidas(List<Partidas> partidas) {
        this.partidas = partidas;
    }
}
