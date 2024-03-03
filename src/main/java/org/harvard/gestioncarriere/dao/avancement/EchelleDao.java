package org.harvard.gestioncarriere.dao.avancement;


import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EchelleDao extends JpaRepository<Echelle,Long> {

    Echelle findByRef(String ref);
    int deleteByRef(String ref);



}
