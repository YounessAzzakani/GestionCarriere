package org.harvard.gestioncarriere.service;

import org.harvard.gestioncarriere.bean.commun.EntiteAdmin;
import org.harvard.gestioncarriere.dao.EntiteAdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntiteAdminService {
    @Autowired
    public EntiteAdminDao entiteAdminDao;

    public EntiteAdmin findByRef(String ref) {
        return entiteAdminDao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return entiteAdminDao.deleteByRef(ref);
    }

    public List<EntiteAdmin> findByDepartement(String departement) {
        return entiteAdminDao.findByDepartement(departement);
    }

    public int deleteByDepartement(String departement) {
        return entiteAdminDao.deleteByDepartement(departement);
    }

    public List<EntiteAdmin> findByTitrePoste(String titrePoste) {
        return entiteAdminDao.findByTitrePoste(titrePoste);
    }

    public int deleteByTitrePoste(String titrePoste) {
        return entiteAdminDao.deleteByTitrePoste(titrePoste);
    }

    public <S extends EntiteAdmin> List<S> findAll(Example<S> example) {
        return entiteAdminDao.findAll(example);
    }

    public <S extends EntiteAdmin> S save(S entity) {
        return entiteAdminDao.save(entity);
    }


}
