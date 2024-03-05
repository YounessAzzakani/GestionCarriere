package org.harvard.gestioncarriere.service.impl.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.bean.avancement.Echelon;
import org.harvard.gestioncarriere.dao.avancement.EchelleDao;
import org.harvard.gestioncarriere.dao.avancement.EchelonDao;
import org.harvard.gestioncarriere.service.facade.avancement.EchelonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class EchelonServiceImpl implements EchelonService {
    public Echelon findByRef(String ref) {
        return echelonDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return echelonDao.deleteByRef(ref);
    }

    public int updateEchelon(Echelon echelon) {
        Echelon exitingEchelon = echelonDao.findByRef(echelon.getRef());
        if (exitingEchelon == null) {
            return -1;
        } else {
            exitingEchelon.setId(echelon.getId());
            exitingEchelon.setRef(echelon.getRef());
            exitingEchelon.setLibelle(echelon.getLibelle());
            exitingEchelon.setEchelle(echelon.getEchelle());
            echelonDao.save(exitingEchelon);
            return 1;
        }
    }

    @Override
    public List<Echelon> findByEchelle(Echelle echelle) {
        return echelonDao.findByEchelle(echelle);
    }

    public List<Echelon> findAll() {

        return echelonDao.findAll();
    }


    public int save(Echelon echelon) {
        if (findByRef(echelon.getRef())!= null) {
            return -1;
        } else {
            echelonDao.save(echelon);
            return 1;
        }
    }

    @Autowired
    private EchelonDao echelonDao;

}
