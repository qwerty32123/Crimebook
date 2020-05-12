package ModelosCrimebook;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Juegos {
    private Integer id;
    private String nombre;
    private String descExtendida;
    private String descBreve;
    private Date fechaCreacion;
    private String username;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 50,unique = true)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "descExtendida", nullable = true, length = 1000)
    public String getDescExtendida() {
        return descExtendida;
    }

    public void setDescExtendida(String descExtendida) {
        this.descExtendida = descExtendida;
    }

    @Basic
    @Column(name = "descBreve", nullable = true, length = 200)
    public String getDescBreve() {
        return descBreve;
    }

    public void setDescBreve(String descBreve) {
        this.descBreve = descBreve;
    }

    @Basic
    @Column(name = "fechaCreacion", nullable = false)
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER, targetEntity = Usuarios.class)
    @JoinColumn(name ="username", referencedColumnName = "username",nullable = false)
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
        Juegos juegos = (Juegos) o;
        return Objects.equals(id, juegos.id) &&
                Objects.equals(nombre, juegos.nombre) &&
                Objects.equals(descExtendida, juegos.descExtendida) &&
                Objects.equals(descBreve, juegos.descBreve) &&
                Objects.equals(fechaCreacion, juegos.fechaCreacion) &&
                Objects.equals(username, juegos.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descExtendida, descBreve, fechaCreacion, username);
    }
}
