package abc.organizacionabc.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import abc.organizacionabc.dto.SocioDTO;
import abc.organizacionabc.repositories.enitities.SocioEntity;

@Component
public class SocioDTOConvert {
    
    @Autowired
    private ModelMapper dbm;

    public SocioDTO convertSocioDTO(SocioEntity socio){
        SocioDTO socioDTO = dbm.map(socio, SocioDTO.class);
        if(socio.getBanco()!=null){
            socioDTO.setBancoId(socio.getBanco().getId());
        }
        if(socio.getSede()!=null){
            socioDTO.setSedeId(socio.getSede().getId());
        }
        return socioDTO;
    }
}
