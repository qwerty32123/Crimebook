package Modelos;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Partidas {
    private Integer id;
    private String nombre;
    private Date fechaCreacion;
    private Integer duracion;
    private Date fechaInicio;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "fechaCreacion", nullable = false)
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "duracion", nullable = false)
    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Basic
    @Column(name = "fechaInicio", nullable = false)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partidas partidas = (Partidas) o;
        return Objects.equals(id, partidas.id) &&
                Objects.equals(nombre, partidas.nombre) &&
                Objects.equals(fechaCreacion, partidas.fechaCreacion) &&
                Objects.equals(duracion, partidas.duracion) &&
                Objects.equals(fechaInicio, partidas.fechaInicio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, fechaCreacion, duracion, fechaInicio);
    }
}
