package ModelosPrueba;

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
    private Integer idJuego;
    private String username;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "fechaCreacion", nullable = false)
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Column(name = "duracion", nullable = false)
    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Column(name = "fechaInicio", nullable = false)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Column(name = "idJuego", nullable = false)
    public Integer getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Integer idJuego) {
        this.idJuego = idJuego;
    }

    @Column(name = "username", nullable = false, length = 15)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
                Objects.equals(fechaInicio, partidas.fechaInicio) &&
                Objects.equals(idJuego, partidas.idJuego) &&
                Objects.equals(username, partidas.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, fechaCreacion, duracion, fechaInicio, idJuego, username);
    }
}
