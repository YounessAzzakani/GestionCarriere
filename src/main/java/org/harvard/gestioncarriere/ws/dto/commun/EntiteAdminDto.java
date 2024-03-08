package org.harvard.gestioncarriere.ws.dto.commun;

import jakarta.persistence.ManyToOne;
import org.harvard.gestioncarriere.bean.commun.Employe;

public class EntiteAdminDto {
    private Long id;
    private String ref;
    private String departement;

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

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Employe getChefDepart() {
        return chefDepart;
    }

    public void setChefDepart(Employe chefDepart) {
        this.chefDepart = chefDepart;
    }

    public String getTitrePoste() {
        return titrePoste;
    }

    public void setTitrePoste(String titrePoste) {
        this.titrePoste = titrePoste;
    }

    // @ManyToOne
    private Employe chefDepart;
    private String titrePoste;

}
