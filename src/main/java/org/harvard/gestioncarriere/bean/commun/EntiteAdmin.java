package org.harvard.gestioncarriere.bean.commun;

import jakarta.persistence.*;

@Entity
public class EntiteAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private String departement;
    @ManyToOne
    private Employe chefDepart;
    private String titrePoste;


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

    public String getTitrePoste() {
        return titrePoste;
    }

    public void setTitrePoste(String titrePoste) {
        this.titrePoste = titrePoste;
    }

    public Employe getChefDepart() {
        return chefDepart;
    }

    public void setChefDepart(Employe chefDepart) {
        this.chefDepart = chefDepart;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
}
