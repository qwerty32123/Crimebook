package Modelos;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PistasPK implements Serializable {
    private Integer idPrueba;
    private Integer id;

    @Column(name = "idPrueba", nullable = false)
    @Id
    public Integer getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(Integer idPrueba) {
        this.idPrueba = idPrueba;
    }

    @Column(name = "id", nullable = false)
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PistasPK pistasPK = (PistasPK) o;
        return Objects.equals(idPrueba, pistasPK.idPrueba) &&
                Objects.equals(id, pistasPK.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrueba, id);
    }
}
