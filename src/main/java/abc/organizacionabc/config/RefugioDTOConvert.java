package abc.organizacionabc.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import abc.organizacionabc.dto.RefugioDTO;
import abc.organizacionabc.repositories.enitities.RefugioEntity;

@Component
public class RefugioDTOConvert {
    
    @Autowired
    private ModelMapper dbm;
    
    public RefugioDTO converRefugioDTO(RefugioEntity refugio){
        return dbm.map(refugio, RefugioDTO.class);
    }

    public RefugioEntity convRefugioEntity(RefugioDTO refugioDTO){
        return dbm.map(refugioDTO, RefugioEntity.class);
    }
}
