package ModelosCrimebook;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(PertenenciasPK.class)
public class Pertenencias {
    private Integer idJuego;
    private Integer idPrueba;

    @Id
    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER, targetEntity = Juegos.class)
    @JoinColumn(name ="idJuego", referencedColumnName = "id",nullable = false)
    public Integer getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Integer idJuego) {
        this.idJuego = idJuego;
    }

    @Id
    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER, targetEntity = Pruebas.class)
    @JoinColumn(name ="idPrueba", referencedColumnName = "id",nullable = false)
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
