package Modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(ResolucionesPK.class)
public class Resoluciones {
    private Integer idPrueba;
    private Integer idEquipo;
    private byte resuelta;
    private Integer intentos;
    private Object estrellas;

    @Id
    @Column(name = "idPrueba", nullable = false)
    public Integer getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(Integer idPrueba) {
        this.idPrueba = idPrueba;
    }

    @Id
    @Column(name = "idEquipo", nullable = false)
    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Basic
    @Column(name = "resuelta", nullable = false)
    public byte getResuelta() {
        return resuelta;
    }

    public void setResuelta(byte resuelta) {
        this.resuelta = resuelta;
    }

    @Basic
    @Column(name = "intentos", nullable = false)
    public Integer getIntentos() {
        return intentos;
    }

    public void setIntentos(Integer intentos) {
        this.intentos = intentos;
    }

    @Basic
    @Column(name = "estrellas", nullable = true)
    public Object getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Object estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resoluciones that = (Resoluciones) o;
        return resuelta == that.resuelta &&
                Objects.equals(idPrueba, that.idPrueba) &&
                Objects.equals(idEquipo, that.idEquipo) &&
                Objects.equals(intentos, that.intentos) &&
                Objects.equals(estrellas, that.estrellas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrueba, idEquipo, resuelta, intentos, estrellas);
    }
}
