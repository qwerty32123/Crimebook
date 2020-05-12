package ModelosCrimebook;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ResolucionesPK implements Serializable {
    private Integer idPrueba;
    private Integer idEquipo;

    @Column(name = "idPrueba", nullable = false)
    @Id
    public Integer getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(Integer idPrueba) {
        this.idPrueba = idPrueba;
    }

    @Column(name = "idEquipo", nullable = false)
    @Id
    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResolucionesPK that = (ResolucionesPK) o;
        return Objects.equals(idPrueba, that.idPrueba) &&
                Objects.equals(idEquipo, that.idEquipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrueba, idEquipo);
    }
}
