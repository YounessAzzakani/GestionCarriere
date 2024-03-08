package org.harvard.gestioncarriere.ws.facade.commun;


import org.harvard.gestioncarriere.bean.commun.Employe;
import org.harvard.gestioncarriere.service.facade.commun.EmployeService;
import org.harvard.gestioncarriere.ws.converter.commun.EmployeConverter;
import org.harvard.gestioncarriere.ws.dto.commun.EmployeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestionCarriere/employe")
public class EmployeWs {
    @Autowired
    private EmployeService employeService;
    @Autowired
    private EmployeConverter employeConverter;

    @GetMapping("/ref/{ref}")
    public EmployeDto findByRef(@PathVariable String ref) {

        Employe employe = employeService.findByRef(ref);
        return employeConverter.toDto(employe);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {

        return employeService.deleteByRef(ref);
    }

    @GetMapping("/ref/{ref}/titrePoste/{titrePoste}")
    public EmployeDto findByDiplome_RefAndEntiteAdmin_TitrePoste(@PathVariable String ref, String titrePoste) {
        Employe employe = employeService.findByDiplome_RefAndEntiteAdmin_TitrePoste(ref, titrePoste);
        return employeConverter.toDto(employe);
    }


    @GetMapping("/")
    public List<EmployeDto> findAll() {

        List<Employe> beans = employeService.findAll();
        List<EmployeDto> dtos = employeConverter.toDto(beans);
        return dtos;
    }

    @PostMapping("/")
    public int save(@RequestBody EmployeDto dto) {
        Employe bean = employeConverter.toBean(dto);
        return employeService.save(bean);
    }


}
