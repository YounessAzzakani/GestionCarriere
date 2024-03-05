package org.harvard.gestioncarriere.service.impl.commun;

import org.harvard.gestioncarriere.bean.commun.Employe;
import org.harvard.gestioncarriere.dao.commun.EmployeDao;
import org.harvard.gestioncarriere.service.facade.commun.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeService {
    //constructeur???


    @Autowired
    private EmployeDao employeDao;

    @Override
    public Employe findByRef(String ref) {

        return employeDao.findByRef(ref);
    }

    @Override
    @Transactional
    public int deleteByRef(String ref) {

        return employeDao.deleteByRef(ref);
    }

    @Override
    public Employe findByDiplome_RefAndEntiteAdmin_TitrePoste(String ref, String titrePoste) {
        return employeDao.findByDiplome_RefAndEntiteAdmin_TitrePoste(ref, titrePoste);
    }


    @Override
    public List<Employe> findAll() {

        return employeDao.findAll();
    }


    @Override
    public int save(Employe employe) {
        if (findByRef(employe.getRef()) != null) {
            return -1;
        } else {
            employeDao.save(employe);
            return 1;
        }
    }
}
