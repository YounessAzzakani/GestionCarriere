package org.harvard.gestioncarriere.ws.dto.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;

public class EchelleDto {
    private long id;
    private String ref;
  private String nom;



    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getRef() {

        return ref;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRef(String ref) {

        this.ref = ref;
    }


}
