package org.harvard.gestioncarriere.ws.facade.commun;

import org.harvard.gestioncarriere.bean.commun.EntiteAdmin;
import org.harvard.gestioncarriere.service.impl.commun.EntiteAdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-carriere/entiteAdmin")
public class EntiteAdminWs {
    @Autowired
    private EntiteAdminServiceImpl entiteAdminService;
    @GetMapping("/ref/{ref}")
    public EntiteAdmin findByRef(@PathVariable String ref) {
        return entiteAdminService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return entiteAdminService.deleteByRef(ref);
    }

    @GetMapping("/departement/{departement}")
    public List<EntiteAdmin> findByDepartement(@PathVariable String departement) {
        return entiteAdminService.findByDepartement(departement);
    }

    @DeleteMapping("/departement/{departement}")
    public int deleteByDepartement(@PathVariable String departement) {
        return entiteAdminService.deleteByDepartement(departement);
    }

    @GetMapping("/titreposte/{titreposte}")
    public List<EntiteAdmin> findByTitrePoste(@PathVariable String titrePoste) {
        return entiteAdminService.findByTitrePoste(titrePoste);
    }

    @GetMapping("/titreposte/{titreposte}")
    public int deleteByTitrePoste(@PathVariable String titrePoste) {
        return entiteAdminService.deleteByTitrePoste(titrePoste);
    }

    @GetMapping("/")
    public List<EntiteAdmin> findAll() {
        return entiteAdminService.findAll();
    }

    @PutMapping("/")
    public int save(@RequestBody EntiteAdmin entiteAdmin) {
        return entiteAdminService.save(entiteAdmin);
    }


}
