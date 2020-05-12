package ModelosCrimebook;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(RespuestasPK.class)
public class Respuestas {
    private Integer idPrueba;
    private Integer id;
    private String respuesta;

    @Id
    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER, targetEntity = Pruebas.class)
    @JoinColumn(name ="idPrueba", referencedColumnName = "id",nullable = false)
    public Integer getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(Integer idPrueba) {
        this.idPrueba = idPrueba;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "respuesta", nullable = false, length = 200)
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Respuestas that = (Respuestas) o;
        return Objects.equals(idPrueba, that.idPrueba) &&
                Objects.equals(id, that.id) &&
                Objects.equals(respuesta, that.respuesta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrueba, id, respuesta);
    }
}
