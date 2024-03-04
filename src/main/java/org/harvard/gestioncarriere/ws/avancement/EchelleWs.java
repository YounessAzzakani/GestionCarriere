package org.harvard.gestioncarriere.ws.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.service.facade.avancement.EchelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gestion/echelle")

public class EchelleWs {
    @Autowired
    private EchelleService echelleService;

    @GetMapping("/ref/{ref}")

    public Echelle findByRef(@PathVariable String ref) {
        return echelleService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")

    public int deleteByRef(@PathVariable String ref) {
        return echelleService.deleteByRef(ref);
    }

    @GetMapping("/")
    public List<Echelle> findAll() {
        return echelleService.findAll();
    }

    @PutMapping("/")
    public int updateEchelle(@RequestBody Echelle echelle) {

        return echelleService.updateEchelle(echelle);
    }

    @PostMapping("/")
    public int save(@RequestBody Echelle echelle) {
        return echelleService.save(echelle);
    }
}
