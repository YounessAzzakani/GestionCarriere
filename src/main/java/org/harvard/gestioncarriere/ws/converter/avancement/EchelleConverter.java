package org.harvard.gestioncarriere.ws.converter.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.ws.dto.avancement.EchelleDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component

public class EchelleConverter {


    public Echelle toBean(EchelleDto dto) {
        Echelle bean = new Echelle();
        bean.setId(dto.getId());
        bean.setRef(dto.getRef());
        bean.setNom(dto.getNom());
        return bean;
    }

    public EchelleDto toDto(Echelle bean) {
        EchelleDto dto = new EchelleDto();
        dto.setId(bean.getId());
        dto.setRef(bean.getRef());
        dto.setNom(bean.getNom());
        return dto;
    }

    public List<Echelle> tobean(List<EchelleDto> dtos) {
        List<Echelle> result = new ArrayList<>();
        for (EchelleDto dto : dtos) {
            result.add(toBean(dto));
        }
        return result;
    }

    public List<EchelleDto> toDto(List<Echelle> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
