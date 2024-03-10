package org.harvard.gestioncarriere.service.impl.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.bean.avancement.Echelon;
import org.harvard.gestioncarriere.dao.avancement.EchelonDao;
import org.harvard.gestioncarriere.service.facade.avancement.EchelleService;
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
        // Rechercher l'échelon existant en fonction de la référence spécifiée
        Echelon exitingEchelon = echelonDao.findByRef(echelon.getRef());
        // Vérifier si l'échelon existe
        if (exitingEchelon == null) {
            // L'échelon n'existe pas, retourner -1 pour indiquer que la mise à jour n'a pas été effectuée
            return -1;
        } else {
            // Mettre à jour les attributs de l'échelon existant avec les valeurs de l'échelon passé en paramètre
            exitingEchelon.setId(echelon.getId());
            exitingEchelon.setRef(echelon.getRef());
            exitingEchelon.setLibelle(echelon.getLibelle());
            exitingEchelon.setEchelle(echelon.getEchelle());
            echelonDao.save(exitingEchelon);
            return 1;
        }
    }

    @Override
    public List<Echelon> findByEchelleRef(String ref) {

        return echelonDao.findByEchelleRef(ref);
    }

    public List<Echelon> findAll() {

        return echelonDao.findAll();
    }


    public int save(Echelon echelon) {
        // Récupérer l'échelle en fonction de la référence spécifiée
        Echelle echelleVar = echelleService.findByRef(echelon.getRef());
        // Définir l'échelle sur l'échelon
        echelon.setEchelle(echelleVar);
        // Vérifier si l'échelon avec la même référence existe déjà
        if (echelonDao.findByRef(echelon.getRef()) != null) {
            // L'échelon existe déjà, retourner 0 pour indiquer que l'enregistrement n'a pas été effectué
            return 0;

        } else {
            // L'échelon n'existe pas, le sauvegarder dans la base de données
            echelonDao.save(echelon);
            // Retourner 1 pour indiquer que l'enregistrement a été effectué avec succès
            return 1;
        }
    }

    @Autowired
    private EchelonDao echelonDao;
    @Autowired
    private EchelleService echelleService;


}
