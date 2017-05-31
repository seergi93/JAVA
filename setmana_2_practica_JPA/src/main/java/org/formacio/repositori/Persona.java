package org.formacio.repositori;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.ManyToOne;

@Entity // indico que esta es la entidad de mi BBDD
@XmlRootElement // per a que acepti peticions XML
public class Persona {

    @Id // indico que esta propiedad es la primary key
    private String clau;
    @JsonProperty("contacte")
    private String nom;
    private String telefon;
    @ManyToOne
    private Grupo grupo;

    public Persona() {
    }

    public Persona(String clau, String nom, String telefon) {
        this.clau = clau;
        this.nom = nom;
        this.telefon = telefon;
    }

    public String getClau() {
        return clau;
    }

    public void setClau(String clau) {
        this.clau = clau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

}
