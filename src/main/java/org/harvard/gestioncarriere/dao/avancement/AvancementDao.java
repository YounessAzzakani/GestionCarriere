package org.harvard.gestioncarriere.dao.avancement;

import org.harvard.gestioncarriere.bean.avancement.Avancement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvancementDao extends JpaRepository<Avancement,Long> {
    Avancement findByRef(String ref);
}
