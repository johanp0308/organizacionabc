package abc.organizacionabc.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import abc.organizacionabc.dto.CuotasDTO;
import abc.organizacionabc.repositories.enitities.CuotasEntity;

@Component
public class CuotasDTOConvert {
    
    @Autowired
    private ModelMapper dbm;
    
    public CuotasDTO convertCuotasDTO(CuotasEntity cuotas){
        CuotasDTO cuotasDTO = dbm.map(cuotas, CuotasDTO.class);
        if(cuotasDTO.getSocioId()!=null){
            cuotasDTO.setSocioId(cuotas.getSocio().getId());
        }
        
        return cuotasDTO;
    }

    public CuotasEntity convertCuotasEntity(CuotasDTO cuotasDTO){
        return dbm.map(cuotasDTO, CuotasEntity.class);
    }
}
