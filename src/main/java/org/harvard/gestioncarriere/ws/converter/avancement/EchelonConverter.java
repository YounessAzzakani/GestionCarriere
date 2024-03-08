package org.harvard.gestioncarriere.ws.converter.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelon;
import org.harvard.gestioncarriere.ws.dto.avancement.EchelonDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component

public class EchelonConverter {


    public Echelon toBean(EchelonDto dto) {
        Echelon bean = new Echelon();
        bean.setId(dto.getId());
        bean.setRef(dto.getRef());
        bean.setLibelle(dto.getLibelle());
        bean.setEchelle(dto.getEchelle());
        bean.setSalaire(dto.getSalaire());
        return bean;
    }

    public EchelonDto toDto(Echelon bean) {
        EchelonDto dto = new EchelonDto();
        dto.setId(bean.getId());
        dto.setRef(bean.getRef());
        dto.setSalaire(bean.getSalaire());
        dto.setEchelle(bean.getEchelle());
        dto.setLibelle(bean.getLibelle());

        return dto;
    }

    public List<Echelon> tobean(List<EchelonDto> dtos) {
        List<Echelon> result = new ArrayList<>();
        for (EchelonDto dto : dtos) {
            result.add(toBean(dto));
        }
        return result;
    }

    public List<EchelonDto> toDto(List<Echelon> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
