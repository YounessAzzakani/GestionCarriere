package org.harvard.gestioncarriere.service.facade.commun;


import org.harvard.gestioncarriere.bean.commun.Employe;

import java.util.List;

public interface EmployeService {
    Employe findByRef(String ref);
    int deleteByRef(String ref);
    Employe findByDiplome_RefAndEntiteAdmin_TitrePoste(String ref, String titrePoste);
    List<Employe> findAll();
    int save(Employe employe);

}
