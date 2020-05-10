package Modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(PistasPK.class)
public class Pistas {
    private Integer idPrueba;
    private Integer id;
    private String texto;
    private Integer tiempo;
    private Integer intentos;

    @Id
    @Column(name = "idPrueba", nullable = false)
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
    @Column(name = "texto", nullable = false, length = 1000)
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Basic
    @Column(name = "tiempo", nullable = true)
    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    @Basic
    @Column(name = "intentos", nullable = true)
    public Integer getIntentos() {
        return intentos;
    }

    public void setIntentos(Integer intentos) {
        this.intentos = intentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pistas pistas = (Pistas) o;
        return Objects.equals(idPrueba, pistas.idPrueba) &&
                Objects.equals(id, pistas.id) &&
                Objects.equals(texto, pistas.texto) &&
                Objects.equals(tiempo, pistas.tiempo) &&
                Objects.equals(intentos, pistas.intentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrueba, id, texto, tiempo, intentos);
    }
}
