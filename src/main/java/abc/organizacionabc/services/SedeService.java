package abc.organizacionabc.services;

import java.util.List;

import abc.organizacionabc.dto.SedeDTO;
import abc.organizacionabc.repositories.enitities.SedeEntity;

public interface SedeService {
    
    List<SedeDTO> findAll();

    void deletById(Long id);

    void save(SedeEntity sede);

}
