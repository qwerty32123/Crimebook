package Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Informacion {

    private String idCrimebook;
    private String Desc;
    @Id
    @Column(name = "idCrimebook", nullable = false)
    public String getIdCrimebook() {
        return idCrimebook;
    }

    public void setIdCrimebook(String idCrimebook) {
        this.idCrimebook = idCrimebook;
    }

    public Informacion() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Column(name = "Desc")
    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
