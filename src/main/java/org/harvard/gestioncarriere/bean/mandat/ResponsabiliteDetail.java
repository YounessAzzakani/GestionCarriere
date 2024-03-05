package org.harvard.gestioncarriere.bean.mandat;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class ResponsabiliteDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime dateAplicationMin;
    private LocalDateTime dateAplicationMax;
    private double salaire;
    @ManyToOne

    private Responsabilite responsabilite;

    public Long getIdResponsabilite() {
        return id;
    }

    public void setIdResponsabilite(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateAplicationMin() {
        return dateAplicationMin;
    }

    public void setDateAplicationMin(LocalDateTime dateAplicationMin) {
        this.dateAplicationMin = dateAplicationMin;
    }

    public LocalDateTime getDateAplicationMax() {
        return dateAplicationMax;
    }

    public void setDateAplicationMax(LocalDateTime dateAplicationMax) {
        this.dateAplicationMax = dateAplicationMax;
    }

    public double getSalaireResponsabilite() {
        return salaire;
    }

    public void setSalaireResponsabilite(double salaire) {
        this.salaire = salaire;
    }

    public Responsabilite getResponsabilite() {
        return responsabilite;
    }

    public void setResponsabilite(Responsabilite responsabilite) {
        this.responsabilite = responsabilite;
    }
}
