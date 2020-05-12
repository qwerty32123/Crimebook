package ModelosCrimebook;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PeticionesPK implements Serializable {
    private Integer idEquipo;
    private Integer idPrueba;
    private Integer idPista;

    @Column(name = "idEquipo", nullable = false)
    @Id
    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Column(name = "idPrueba", nullable = false)
    @Id
    public Integer getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(Integer idPrueba) {
        this.idPrueba = idPrueba;
    }

    @Column(name = "idPista", nullable = false)
    @Id
    public Integer getIdPista() {
        return idPista;
    }

    public void setIdPista(Integer idPista) {
        this.idPista = idPista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeticionesPK that = (PeticionesPK) o;
        return Objects.equals(idEquipo, that.idEquipo) &&
                Objects.equals(idPrueba, that.idPrueba) &&
                Objects.equals(idPista, that.idPista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEquipo, idPrueba, idPista);
    }
}
