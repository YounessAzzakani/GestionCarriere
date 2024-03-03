package org.harvard.gestioncarriere.service;

import org.harvard.gestioncarriere.bean.commun.Employe;
import org.harvard.gestioncarriere.dao.EmployeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {
    @Autowired
    private EmployeDao employeDao;
    public Employe findByRef(String ref) {
        return employeDao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return employeDao.deleteByRef(ref);
    }

    public Employe findByDiplomeAndEntiteAdmin(String ref, String titrePoste) {
        return employeDao.findByDiplomeAndEntiteAdmin(ref, titrePoste);
    }

    public Employe findByResponsabiliteAndEntiteAdmin(String nom, String titrePoste) {
        return employeDao.findByResponsabiliteAndEntiteAdmin(nom, titrePoste);
    }

    public List<Employe> findAll() {
        return employeDao.findAll();
    }


}
