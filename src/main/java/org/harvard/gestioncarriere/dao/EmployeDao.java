package org.harvard.gestioncarriere.dao;

import org.harvard.gestioncarriere.bean.commun.Diplome;
import org.harvard.gestioncarriere.bean.commun.Employe;
import org.harvard.gestioncarriere.bean.commun.EntiteAdmin;
import org.harvard.gestioncarriere.bean.mandat.Responsabilite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeDao extends JpaRepository <Employe,Long> {
        Employe findByRef (String ref);
        int deleteByRef(String ref);
        Employe findByDiplomeAndEntiteAdmin (String ref, String  titrePoste);
        Employe findByResponsabiliteAndEntiteAdmin(String nom, String titrePoste);

}



