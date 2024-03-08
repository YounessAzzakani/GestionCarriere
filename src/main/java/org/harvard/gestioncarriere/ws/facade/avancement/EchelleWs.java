package org.harvard.gestioncarriere.ws.facade.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.bean.avancement.Echelon;
import org.harvard.gestioncarriere.service.facade.avancement.EchelleService;
import org.harvard.gestioncarriere.ws.converter.avancement.EchelleConverter;
import org.harvard.gestioncarriere.ws.dto.avancement.EchelleDto;
import org.harvard.gestioncarriere.ws.dto.avancement.EchelonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gestion/echelle")

public class EchelleWs {
    @Autowired
    private EchelleService echelleService;
    @Autowired
    private EchelleConverter echelleConverter;

    @GetMapping("/ref/{ref}")

    public EchelleDto findByRef(@PathVariable String ref) {

        Echelle echelle = echelleService.findByRef(ref);
        return echelleConverter.toDto(echelle);
    }

    @DeleteMapping("/ref/{ref}")

    public int deleteByRef(@PathVariable String ref) {

        return echelleService.deleteByRef(ref);
    }

    @GetMapping("/")
    public List<EchelleDto> findAll() {

        List<Echelle> beans = echelleService.findAll();
        List<EchelleDto> dtos = echelleConverter.toDto(beans);
        return dtos;
    }

    @PutMapping("/")
    public int updateEchelle(@RequestBody Echelle echelle) {

        return echelleService.updateEchelle(echelle);
    }

    @PostMapping("/")
    public int save(@RequestBody EchelleDto dto) {

        Echelle bean = echelleConverter.toBean(dto);
        return echelleService.save(bean);
    }
}
