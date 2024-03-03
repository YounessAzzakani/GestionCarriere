package org.harvard.gestioncarriere.service.impl.commun;

import org.harvard.gestioncarriere.bean.commun.EntiteAdmin;
import org.harvard.gestioncarriere.dao.commun.EntiteAdminDao;
import org.harvard.gestioncarriere.service.facade.commun.EntiteAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntiteAdminServiceImpl implements EntiteAdminService {
    //constructeur ?? manquant?
    @Autowired
    public EntiteAdminDao entiteAdminDao;

    @Override
    public EntiteAdmin findByRef(String ref) {
        return entiteAdminDao.findByRef(ref);
    }

    @Override
    public int deleteByRef(String ref) {
        return entiteAdminDao.deleteByRef(ref);
    }

    @Override
    public List<EntiteAdmin> findByDepartement(String departement) {
        return entiteAdminDao.findByDepartement(departement);
    }

    @Override
    public int deleteByDepartement(String departement) {
        return entiteAdminDao.deleteByDepartement(departement);
    }

    @Override
    public List<EntiteAdmin> findByTitrePoste(String titrePoste) {
        return entiteAdminDao.findByTitrePoste(titrePoste);
    }

    @Override
    public int deleteByTitrePoste(String titrePoste) {
        return entiteAdminDao.deleteByTitrePoste(titrePoste);
    }

    @Override
    public List<EntiteAdmin> findAll() {
        return entiteAdminDao.findAll();
    }


    @Override
    public int save(EntiteAdmin entiteAdmin) {
        if (findByRef(EntiteAdmin.getRef()) != null) {
            return -1;
        } else {
            entiteAdminDao.save(EntiteAdmin);
            return 1;
        }
    }


}
