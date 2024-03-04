package org.harvard.gestioncarriere.ws.facade.commun;

import org.harvard.gestioncarriere.bean.commun.Employe;
import org.harvard.gestioncarriere.service.impl.commun.EmployeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-carriere/employe")
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

    @GetMapping("/diplome/{diplome}/entiteAdmin/{entiteAdmin}")
    public Employe findByDiplomeAndEntiteAdmin(@PathVariable String ref, String titrePoste) {
        return employeService.findByDiplomeAndEntiteAdmin(ref, titrePoste);
    }

    @GetMapping("/responsabilite/{responsabilite}/entiteAdmin/{entiteAdmin}")

    public Employe findByResponsabiliteAndEntiteAdmin(@PathVariable String nom, @PathVariable String titrePoste) {
        return employeService.findByResponsabiliteAndEntiteAdmin(nom, titrePoste);
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
