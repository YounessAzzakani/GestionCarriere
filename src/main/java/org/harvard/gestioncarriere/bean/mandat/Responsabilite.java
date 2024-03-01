package org.harvard.gestioncarriere.bean.mandat;

import jakarta.persistence.*;
import org.harvard.gestioncarriere.bean.avancement.Echelon;

@Entity
public class Responsabilite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;


    private String nom;


    @ManyToOne
    private Echelon echelonMin;

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

    public Echelon getEchelonMin() {
        return echelonMin;
    }

    public void setEchelonMin(Echelon echelonMin) {
        this.echelonMin = echelonMin;
    }
}
