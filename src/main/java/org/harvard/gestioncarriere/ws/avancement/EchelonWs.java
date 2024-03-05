package org.harvard.gestioncarriere.ws.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.bean.avancement.Echelon;
import org.harvard.gestioncarriere.service.facade.avancement.EchelleService;
import org.harvard.gestioncarriere.service.facade.avancement.EchelonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gestion/echelon")

public class EchelonWs {
    @GetMapping("ref/{ref}")
    public Echelon findByRef(@PathVariable String ref) {
        return echelonService.findByRef(ref);
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
    public List<Echelon> findByEchelle(@RequestBody Echelle echelle) {
        return echelonService.findByEchelle(echelle);
    }

    @GetMapping("/")
    public List<Echelon> findAll() {

        return echelonService.findAll();
    }

    @PostMapping("/")
    public int save(Echelon echelon) {

        return echelonService.save(echelon);
    }

    @Autowired
    private EchelonService echelonService;

}
