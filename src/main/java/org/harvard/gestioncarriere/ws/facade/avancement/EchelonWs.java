package org.harvard.gestioncarriere.ws.facade.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.bean.avancement.Echelon;
import org.harvard.gestioncarriere.service.facade.avancement.EchelonService;
import org.harvard.gestioncarriere.ws.converter.avancement.EchelonConverter;
import org.harvard.gestioncarriere.ws.dto.avancement.EchelonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/gestion/echelon")

public class EchelonWs {
    @GetMapping("ref/{ref}")
    public EchelonDto findByRef(@PathVariable String ref) {

        Echelon echelon = echelonService.findByRef(ref);
        return echelonConverter.toDto(echelon);
    }

    @DeleteMapping("ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {

        return echelonService.deleteByRef(ref);
    }

    @PutMapping("/")
    public int updateEchelon(@RequestBody Echelon echelon) {

        return echelonService.updateEchelon(echelon);
    }

    @GetMapping("//")
    public List<EchelonDto> findByEchelle(@RequestBody Echelle echelle) {

        List<Echelon> echelons = echelonService.findByEchelle(echelle);
        List<EchelonDto> dtos = echelonConverter.toDto(echelons);
        return dtos;
    }

    @GetMapping("/")
    public List<EchelonDto> findAll() {

        List<Echelon> beans = echelonService.findAll();
        List<EchelonDto> dtos = echelonConverter.toDto(beans);
        return dtos;
    }

    @PostMapping("/")
    public int save(@RequestBody EchelonDto dto) {

        Echelon bean = echelonConverter.toBean(dto);
        return echelonService.save(bean);
    }

    @Autowired
    private EchelonService echelonService;
    @Autowired
    private EchelonConverter echelonConverter;

}
