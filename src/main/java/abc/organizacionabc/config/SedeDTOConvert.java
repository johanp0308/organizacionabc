package abc.organizacionabc.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import abc.organizacionabc.dto.SedeDTO;
import abc.organizacionabc.repositories.enitities.SedeEntity;

@Component
public class SedeDTOConvert {
    
    @Autowired
    private ModelMapper dbm;

    public SedeDTO convertSedeDTO(SedeEntity sede){
        SedeDTO sedeDTO = dbm.map(sede, SedeDTO.class);
        if(sede.getDirector()!=null){
            sedeDTO.setDirectorId(sede.getDirector().getId());
        }
        return sedeDTO;
    }

    public SedeEntity convertSedeEntity(SedeDTO sedeDTO){
        return dbm.map(sedeDTO, SedeEntity.class);
    }
}
