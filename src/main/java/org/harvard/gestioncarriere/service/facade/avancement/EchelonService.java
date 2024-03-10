package org.harvard.gestioncarriere.service.facade.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.bean.avancement.Echelon;

import java.util.List;

public interface EchelonService {
    Echelon findByRef(String ref);

    int deleteByRef(String ref);

    int updateEchelon(Echelon echelon);

    List<Echelon> findAll();

    int save(Echelon echelon);
    List<Echelon> findByEchelleRef(String ref);

}
