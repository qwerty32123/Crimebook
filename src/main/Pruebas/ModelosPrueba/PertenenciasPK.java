package ModelosPrueba;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PertenenciasPK implements Serializable {
    private Integer idJuego;
    private Integer idPrueba;

    @Column(name = "idJuego", nullable = false)
    @Id
    public Integer getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Integer idJuego) {
        this.idJuego = idJuego;
    }

    @Column(name = "idPrueba", nullable = false)
    @Id
    public Integer getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(Integer idPrueba) {
        this.idPrueba = idPrueba;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PertenenciasPK that = (PertenenciasPK) o;
        return Objects.equals(idJuego, that.idJuego) &&
                Objects.equals(idPrueba, that.idPrueba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJuego, idPrueba);
    }
}
