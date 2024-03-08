package org.harvard.gestioncarriere.ws.dto.commun;

import jakarta.persistence.ManyToOne;
import org.harvard.gestioncarriere.bean.commun.Diplome;
import org.harvard.gestioncarriere.bean.commun.EntiteAdmin;

public class EmployeDto {
    private Long id;
    private String ref;
    private String username;
    private String nom;
    private String password;
    private double salaire;
    // @ManyToOne
    private Diplome diplome;
    // @ManyToOne
    private EntiteAdmin entiteAdmin;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }

    public EntiteAdmin getEntiteAdmin() {
        return entiteAdmin;
    }

    public void setEntiteAdmin(EntiteAdmin entiteAdmin) {
        this.entiteAdmin = entiteAdmin;
    }
}
