package org.harvard.gestioncarriere.dao.commun;

import org.harvard.gestioncarriere.bean.commun.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeDao extends JpaRepository <Employe,Long> {
        Employe findByRef (String ref);
        int deleteByRef(String ref);
        Employe findByDiplomeRefAndEntiteAdminTitrePoste(String ref, String  titrePoste);


}



