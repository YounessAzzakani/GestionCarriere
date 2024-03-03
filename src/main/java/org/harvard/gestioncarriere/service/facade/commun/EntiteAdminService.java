package org.harvard.gestioncarriere.service.facade.commun;

import org.harvard.gestioncarriere.bean.commun.EntiteAdmin;
import org.springframework.data.domain.Example;

import java.util.List;

public interface EntiteAdminService {
    EntiteAdmin findByRef(String ref);
    int deleteByRef(String ref);
    List<EntiteAdmin> findByDepartement(String departement);
    int deleteByDepartement(String departement);
    List<EntiteAdmin> findByTitrePoste(String titrePoste);
    int deleteByTitrePoste(String titrePoste);
    List<EntiteAdmin> findAll();
    int save(EntiteAdmin entiteAdmin);

}

