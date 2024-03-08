package org.harvard.gestioncarriere.ws.converter.commun;

import org.harvard.gestioncarriere.bean.commun.Employe;
import org.harvard.gestioncarriere.ws.dto.commun.EmployeDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeConverter {

    public Employe toBean(EmployeDto dto){
        Employe bean = new Employe();
        bean.setId(dto.getId());
        bean.setRef(dto.getRef());
        bean.setNom(dto.getNom());
        bean.setUsername(dto.getUsername());
        bean.setPassword(dto.getPassword());
        bean.setSalaire(dto.getSalaire());
        bean.setDiplome(dto.getDiplome());
        bean.setEntiteAdmin(dto.getEntiteAdmin());
        return bean;
    }

    public EmployeDto toDto(Employe bean) {
        EmployeDto dto = new EmployeDto();
        dto.setId(bean.getId());
        dto.setRef(bean.getRef());
        dto.setNom(bean.getNom());
        // a verifier
        dto.setUsername(bean.getUsername());
        dto.setPassword(bean.getPassword());
        dto.setSalaire(bean.getSalaire());
        dto.setDiplome(bean.getDiplome());
        dto.setEntiteAdmin(bean.getEntiteAdmin());
        return dto;
    }


    public List<Employe> tobean(List<EmployeDto> dtos) {
        List<Employe> result = new ArrayList<>();
        for (EmployeDto dto : dtos) {
            result.add(toBean(dto));
        }
        return result;
    }

    public List<EmployeDto> toDto(List<Employe> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }

}
