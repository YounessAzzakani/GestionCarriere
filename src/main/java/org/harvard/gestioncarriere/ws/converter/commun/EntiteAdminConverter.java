package org.harvard.gestioncarriere.ws.converter.commun;

import org.harvard.gestioncarriere.bean.commun.EntiteAdmin;
import org.harvard.gestioncarriere.ws.dto.commun.EntiteAdminDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EntiteAdminConverter {
    public EntiteAdmin toBean(EntiteAdminDto dto){
        EntiteAdmin bean = new EntiteAdmin();
        bean.setId(dto.getId());
        bean.setRef(dto.getRef());
        bean.setDepartement(dto.getDepartement());
        bean.setChefDepart(dto.getChefDepart()); //manyToOne
        bean.setTitrePoste(dto.getTitrePoste());
        return bean;
    }

    public EntiteAdminDto toDto(EntiteAdmin bean) {
        EntiteAdminDto dto = new EntiteAdminDto();
        dto.setId(bean.getId());
        dto.setRef(bean.getRef());
        dto.setDepartement(bean.getDepartement());
        // a verifier
        dto.setChefDepart(bean.getChefDepart());
        dto.setTitrePoste(bean.getTitrePoste());
        return dto;
    }


    public List<EntiteAdmin> tobean(List<EntiteAdminDto> dtos) {
        List<EntiteAdmin> result = new ArrayList<>();
        for (EntiteAdminDto dto : dtos) {
            result.add(toBean(dto));
        }
        return result;
    }

    public List<EntiteAdminDto> toDto(List<EntiteAdmin> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
