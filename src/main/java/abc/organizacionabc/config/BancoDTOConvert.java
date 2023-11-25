
package abc.organizacionabc.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import abc.organizacionabc.dto.BancoDTO;
import abc.organizacionabc.repositories.enitities.BancoEntity;

@Component
public class BancoDTOConvert {
    
    @Autowired
    private ModelMapper dbm; 

    public BancoDTO convertBanctoDTO(BancoEntity banco){
        return dbm.map(banco,BancoDTO.class);
    }

    public BancoEntity convertBancoEntity(BancoDTO bancoDTO){
        return dbm.map(bancoDTO,BancoEntity.class);
    }
}