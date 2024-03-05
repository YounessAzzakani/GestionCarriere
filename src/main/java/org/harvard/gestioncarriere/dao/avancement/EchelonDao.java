package org.harvard.gestioncarriere.dao.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.bean.avancement.Echelon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EchelonDao extends JpaRepository<Echelon, Long> {

    Echelon findByRef(String ref);

    int deleteByRef(String ref);
    List<Echelon> findByEchelle(Echelle echelle);


}
