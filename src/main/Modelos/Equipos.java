package ModelosCrimebook;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Equipos {
    private Integer id;
    private Integer codigo;
    private String nombre;
    private Integer tiempo;
    private Integer idPartida;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Column(name = "codigo", nullable = false,unique = true)
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "tiempo", nullable = false)
    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }


    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER, targetEntity = Partidas.class )
    @JoinColumn(name ="idPartida", referencedColumnName = "id",nullable = false)
    public Integer getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(Integer idPartida) {
        this.idPartida = idPartida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipos equipos = (Equipos) o;
        return Objects.equals(id, equipos.id) &&
                Objects.equals(codigo, equipos.codigo) &&
                Objects.equals(nombre, equipos.nombre) &&
                Objects.equals(tiempo, equipos.tiempo) &&
                Objects.equals(idPartida, equipos.idPartida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, nombre, tiempo, idPartida);
    }
}
