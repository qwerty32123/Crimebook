package ModelosPrueba;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Objects;

@Entity
@IdClass(PertenenciasPK.class)
public class Pertenencias {
    private Integer idJuego;
    private Integer idPrueba;

    @Id
    @Column(name = "idJuego", nullable = false)
    public Integer getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Integer idJuego) {
        this.idJuego = idJuego;
    }

    @Id
    @Column(name = "idPrueba", nullable = false)
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
        Pertenencias that = (Pertenencias) o;
        return Objects.equals(idJuego, that.idJuego) &&
                Objects.equals(idPrueba, that.idPrueba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJuego, idPrueba);
    }
}
