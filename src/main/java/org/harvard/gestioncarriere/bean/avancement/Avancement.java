package org.harvard.gestioncarriere.bean.avancement;

import jakarta.persistence.*;
import org.harvard.gestioncarriere.bean.commun.Employe;

@Entity
public class Avancement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;


    @ManyToOne
    private Employe employe;
    @ManyToOne
    private Echelon echelleAncien;
    @ManyToOne
    private Echelon echelleNouveau;
    private double salaireAjoute;

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

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Echelon getEchelleAncien() {
        return echelleAncien;
    }

    public void setEchelleAncien(Echelon echelleAncien) {
        this.echelleAncien = echelleAncien;
    }

    public Echelon getEchelleNouveau() {
        return echelleNouveau;
    }

    public void setEchelleNouveau(Echelon echelleNouveau) {
        this.echelleNouveau = echelleNouveau;
    }

    public double getSalaireAjoute() {
        return salaireAjoute;
    }

    public void setSalaireAjoute(double salaireAjoute) {
        this.salaireAjoute = salaireAjoute;
    }
}
