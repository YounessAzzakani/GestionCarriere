package org.harvard.gestioncarriere.ws.facade.commun;

import org.harvard.gestioncarriere.bean.commun.Employe;
import org.harvard.gestioncarriere.bean.commun.EntiteAdmin;
import org.harvard.gestioncarriere.bean.commun.EntiteAdmin;
import org.harvard.gestioncarriere.service.facade.commun.EntiteAdminService;
import org.harvard.gestioncarriere.service.impl.commun.EntiteAdminServiceImpl;
import org.harvard.gestioncarriere.ws.converter.commun.EntiteAdminConverter;
import org.harvard.gestioncarriere.ws.dto.commun.EmployeDto;
import org.harvard.gestioncarriere.ws.dto.commun.EntiteAdminDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-carriere/entiteAdmin")
public class EntiteAdminWs {
    @Autowired
    private EntiteAdminService entiteAdminService;
    @Autowired
    private EntiteAdminConverter entiteAdminConverter;

    @GetMapping("/ref/{ref}")
    public EntiteAdminDto findByRef(@PathVariable String ref) {

        EntiteAdmin entiteAdmin = entiteAdminService.findByRef(ref);
        return entiteAdminConverter.toDto(entiteAdmin);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {

        return entiteAdminService.deleteByRef(ref);
    }

    @GetMapping("/departement/{departement}")
    public List<EntiteAdminDto> findByDepartement(@PathVariable String departement) {
        List<EntiteAdmin> beans = entiteAdminService.findByDepartement(departement);
        List<EntiteAdminDto> dtos = entiteAdminConverter.toDto(beans);
        return dtos;
    }

    @DeleteMapping("/departement/{departement}")
    public int deleteByDepartement(@PathVariable String departement) {
        return entiteAdminService.deleteByDepartement(departement);
    }

    @GetMapping("/titreposte/{titreposte}")
    public List<EntiteAdminDto> findByTitrePoste(@PathVariable String titrePoste) {
        List<EntiteAdmin> beans = entiteAdminService.findByTitrePoste(titrePoste);
        List<EntiteAdminDto> dtos = entiteAdminConverter.toDto(beans);
        return dtos;
    }

    @DeleteMapping("/titreposte/{titreposte}")
    public int deleteByTitrePoste(@PathVariable String titrePoste) {
        return entiteAdminService.deleteByTitrePoste(titrePoste);
    }

    @GetMapping("/")
    public List<EntiteAdminDto> findAll() {

        List<EntiteAdmin> beans = entiteAdminService.findAll();
        List<EntiteAdminDto> dtos = entiteAdminConverter.toDto(beans);
        return dtos;
    }

    @PutMapping("/")
    public int save(@RequestBody EntiteAdminDto dto) {

        EntiteAdmin bean = entiteAdminConverter.toBean(dto);
        return entiteAdminService.save(bean);
    }


}
