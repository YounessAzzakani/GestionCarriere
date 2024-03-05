package org.harvard.gestioncarriere.service.impl.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.dao.avancement.EchelleDao;
import org.harvard.gestioncarriere.service.facade.avancement.EchelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EchelleServiceImpl implements EchelleService {

    @Autowired
    private EchelleDao echelleDao;

    public Echelle findByRef(String ref) {
        return echelleDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return echelleDao.deleteByRef(ref);
    }

    public List<Echelle> findAll() {

        return echelleDao.findAll();
    }

    public int save(Echelle echelle) {
        if (findByRef(echelle.getRef())!= null) {
            return -1;
        } else {
            echelleDao.save(echelle);
            return 1;
        }
    }

    public int updateEchelle(Echelle echelle) {

        Echelle existingEchelle = echelleDao.findByRef(echelle.getRef());
        if (existingEchelle == null) {
            return -1;
        } else {
            existingEchelle.setId(echelle.getId());
            existingEchelle.setRef(echelle.getRef());
            existingEchelle.setNom(echelle.getNom());
            echelleDao.save(existingEchelle);
            return 1;
        }

    }

}
