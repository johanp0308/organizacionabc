package abc.organizacionabc.services;

import java.util.List;

import abc.organizacionabc.dto.SedeDTO;
import abc.organizacionabc.dto.SocioDTO;
import abc.organizacionabc.repositories.enitities.SocioEntity;

public interface SocioService {
    
    List<SocioDTO> findAll();
    
    void delete(Long id);

    void save(SocioEntity socio);

}
