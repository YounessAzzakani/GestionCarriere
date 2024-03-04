package org.harvard.gestioncarriere.service.facade.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;

import java.util.List;

public interface EchelleService {
    Echelle findByRef(String ref);

    int deleteByRef(String ref);

    List<Echelle> findAll();

    int save(Echelle echelle);

    int updateEchelle(Echelle echelle);
}
