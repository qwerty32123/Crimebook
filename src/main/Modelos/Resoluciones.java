package Modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(ResolucionesPK.class)
public class Resoluciones {
    //DEFINIMOS LOS POSIBLES VALORES DEL ENUM
    public static final int CERO = 0;
    public static final int UNA = 1;
    public static final int DOS = 2;
    public static final int TRES = 3;
    public static final int CUATRO = 4;
    public static final int CINCO = 5;

    //Enum de la tabla estrellas
    public enum Estrellas{
        CERO,
        UNA,
        DOS,
        TRES,
        CUATRO,
        CINCO


    }
    private Integer idPrueba;
    private Integer idEquipo;
    private byte resuelta;
    private Integer intentos;
    private Estrellas estrellas;

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
    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER, targetEntity = Equipos.class)
    @JoinColumn(name ="idEquipo", referencedColumnName = "id",nullable = false)
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
    @Column(columnDefinition = "ENUM('0','1','2','3','4','5')",name = "estrellas", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    public Estrellas getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Estrellas estrellas) {
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
