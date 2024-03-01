package org.harvard.gestioncarriere.bean.commun;

import jakarta.persistence.*;
import org.harvard.gestioncarriere.bean.avancement.Echelon;

@Entity
public class Diplome {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String ref;
    private String libelle;
    @ManyToOne
    private Echelon echelon;

    public Long getidDiplome() {
        return id;
    }

    public void setidDiplome(Long idDiplome) {
        idDiplome = idDiplome;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Echelon getEchelon() {
        return echelon;
    }

    public void setEchelon(Echelon echelon) {
        this.echelon = echelon;
    }

    public String getRefDiplome() {
        return ref;
    }

    public void setRefDiplome(String refDiplome) {
        this.ref = refDiplome;
    }


}
