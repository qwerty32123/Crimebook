package Modelos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Objects;

@Entity
public class Partidas {
    private Integer id;
    private String nombre;
    private Timestamp fechaCreacion;
    private Integer duracion;
    private Timestamp fechaInicio;
    private Juegos idJuego;
    private Usuarios username;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nombre", nullable = false, length = 50,unique = true)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "fechaCreacion", nullable = false)
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
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
    public Timestamp getFechaInicio() {
        String s = new SimpleDateFormat("MM/dd/yyyy HH:mm").format(fechaInicio);

        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER, targetEntity = Juegos.class)
    @JoinColumn(name ="idJuego", referencedColumnName = "id",nullable = false)
    public Juegos getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Juegos idJuego) {
        this.idJuego = idJuego;
    }
    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER, targetEntity = Usuarios.class)
    @JoinColumn(name ="username", referencedColumnName = "username",nullable = false)
    public Usuarios getUsername() {
        return username;
    }

    public void setUsername(Usuarios username) {
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
