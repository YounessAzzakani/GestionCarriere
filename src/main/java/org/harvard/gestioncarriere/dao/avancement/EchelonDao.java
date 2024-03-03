package org.harvard.gestioncarriere.dao.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EchelonDao extends JpaRepository<Echelon,Long> {

    Echelon findByRef(String ref);
    int deleteByRef(String ref);
    int update(Echelon echelon);

}
