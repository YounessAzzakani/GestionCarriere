package org.harvard.gestioncarriere.dao.commun;

import org.harvard.gestioncarriere.bean.commun.EntiteAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntiteAdminDao extends JpaRepository<EntiteAdmin,Long> {
    EntiteAdmin findByRef(String ref);
    int deleteByRef(String ref);
    List<EntiteAdmin> findByDepartement(String departement);
    int deleteByDepartement(String departement);

    List<EntiteAdmin> findByTitrePoste(String titrePoste);
    int deleteByTitrePoste(String titrePoste);

}
