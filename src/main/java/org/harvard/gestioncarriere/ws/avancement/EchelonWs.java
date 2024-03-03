package org.harvard.gestioncarriere.ws.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelon;
import org.harvard.gestioncarriere.service.avancement.EchelonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/gestion/echelon")
@RequestMapping()

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
    public int update(@RequestBody Echelon echelon) {
        return echelonService.update(echelon);
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
