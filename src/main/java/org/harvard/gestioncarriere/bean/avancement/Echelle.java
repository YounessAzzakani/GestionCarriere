package org.harvard.gestioncarriere.bean.avancement;

import jakarta.persistence.*;

@Entity
public class Echelle {
    @Id
    private Long id;
    private String ref;


    private String nom;

    public Long getId() {
        return id;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
