package Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Objects;

@Entity
@IdClass(PeticionesPK.class)
public class Peticiones {
    private Integer idEquipo;
    private Integer idPrueba;
    private Integer idPista;

    @Id
    @Column(name = "idEquipo", nullable = false)
    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Id
    @Column(name = "idPrueba", nullable = false)
    public Integer getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(Integer idPrueba) {
        this.idPrueba = idPrueba;
    }

    @Id
    @Column(name = "idPista", nullable = false)
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
        Peticiones that = (Peticiones) o;
        return Objects.equals(idEquipo, that.idEquipo) &&
                Objects.equals(idPrueba, that.idPrueba) &&
                Objects.equals(idPista, that.idPista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEquipo, idPrueba, idPista);
    }
}
