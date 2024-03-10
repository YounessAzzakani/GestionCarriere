package org.harvard.gestioncarriere.bean.avancement;

import jakarta.persistence.*;

@Entity
public class Echelon {
    @Id
    private Long id;
    private String ref;
    @ManyToOne
    private Echelle echelle;
    private String libelle;

    private double salaire;

    public Long getId() {

        return id;
    }

    public double getSalaire() {

        return salaire;
    }

    public void setSalaire(double salaire) {

        this.salaire = salaire;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Echelle getEchelle() {

        return echelle;
    }

    public void setEchelle(Echelle echelle) {

        this.echelle = echelle;
    }

    public String getLibelle() {

        return libelle;
    }

    public void setLibelle(String libelle) {

        this.libelle = libelle;
    }
}
