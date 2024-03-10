package org.harvard.gestioncarriere.ws.dto.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;

public class EchelonDto {
    private long id;
    private String ref;
    private Echelle echelle;
    private String libelle;

    private double salaire;

    public long getId() {

        return id;
    }

    public void setId(long id) {

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

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
