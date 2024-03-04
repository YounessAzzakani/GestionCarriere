package org.harvard.gestioncarriere.service.facade.commun;


import org.harvard.gestioncarriere.bean.commun.Employe;

import java.util.List;

public interface EmployeService {
    Employe findByRef(String ref);
    int deleteByRef(String ref);
    Employe findByDiplomeAndEntiteAdmin(String ref, String titrePoste);
    Employe findByResponsabiliteAndEntiteAdmin(String nom, String titrePoste);
    List<Employe> findAll();
    int save(Employe employe);

}
