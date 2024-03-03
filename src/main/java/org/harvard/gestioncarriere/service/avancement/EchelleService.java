package org.harvard.gestioncarriere.service.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.dao.avancement.EchelleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EchelleService {
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
        if (echelle.getRef()!=null){
            return -1;
        }else {
            echelleDao.save(echelle);
            return 1;
        }
    }

    public int update(Echelle echelle) {

        Echelle existingEchelle = echelleDao.findByRef(echelle.getRef());
        if (existingEchelle == null) {
            return -1;
        }else {
            existingEchelle.setId(echelle.getId());
            existingEchelle.setRef(echelle.getRef());
            existingEchelle.setNom(echelle.getNom());

            echelleDao.update(existingEchelle);
            return 1;
        }

    }

    @Autowired
    private EchelleDao echelleDao;
}
