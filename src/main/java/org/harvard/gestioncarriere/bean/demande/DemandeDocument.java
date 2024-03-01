package org.harvard.gestioncarriere.bean.demande;

import jakarta.persistence.*;
import org.harvard.gestioncarriere.bean.commun.Employe;

@Entity

public class DemandeDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    @ManyToOne
    private Employe employe;
    @ManyToOne
    private TypeDocument typeDocument;

}
