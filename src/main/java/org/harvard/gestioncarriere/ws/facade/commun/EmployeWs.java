package org.harvard.gestioncarriere.ws.facade.commun;

import org.harvard.gestioncarriere.bean.commun.Employe;
import org.harvard.gestioncarriere.service.impl.commun.EmployeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestionCarriere/employe")
public class EmployeWs {
    @Autowired
    private EmployeServiceImpl employeService;
    @GetMapping("/ref/{ref}")
    public Employe findByRef(@PathVariable String ref) {

        return employeService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return employeService.deleteByRef(ref);
    }

    @GetMapping("/ref/{ref}/titrePoste/{titrePoste}")
    public Employe findByDiplome_RefAndEntiteAdmin_TitrePoste(@PathVariable String ref, String titrePoste) {
        return employeService.findByDiplome_RefAndEntiteAdmin_TitrePoste(ref, titrePoste);
    }


    @GetMapping("/")
    public List<Employe> findAll() {

        return employeService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Employe employe) {

        return employeService.save(employe);
    }


}
