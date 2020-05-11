package ModelosPrueba;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Usuarios {
    private String username;
    private String email;
    private String nombre;
    private String apellidos;
    private String contrasenya;

    @Id
    @Column(name = "username", nullable = false, length = 15)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "apellidos", nullable = false, length = 50)
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Basic
    @Column(name = "contrasenya", nullable = false, length = 30)
    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(username, usuarios.username) &&
                Objects.equals(email, usuarios.email) &&
                Objects.equals(nombre, usuarios.nombre) &&
                Objects.equals(apellidos, usuarios.apellidos) &&
                Objects.equals(contrasenya, usuarios.contrasenya);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, nombre, apellidos, contrasenya);
    }
}
