package abc.organizacionabc.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import abc.organizacionabc.dto.EnvioDTO;
import abc.organizacionabc.repositories.enitities.EnvioEntity;

@Component
public class EnvioDTOConvert {
    
    @Autowired
    private ModelMapper dbm;
    
    public EnvioDTO convertEnvioDTO(EnvioEntity envio){
        EnvioDTO envioDTO = dbm.map(envio, EnvioDTO.class);
        if(envioDTO.getRefugioId()!=null){
            envioDTO.setRefugioId(envio.getRefugio().getId());
        }
        return envioDTO;
    }

    public EnvioEntity convertEnvioEntity(EnvioDTO envioDTO){
        return dbm.map(envioDTO, EnvioEntity.class);
    }
}
