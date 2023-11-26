package abc.organizacionabc.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abc.organizacionabc.config.SocioDTOConvert;
import abc.organizacionabc.dto.SocioDTO;
import abc.organizacionabc.repositories.SocioRepository;
import abc.organizacionabc.repositories.enitities.SocioEntity;
import abc.organizacionabc.services.SocioService;

@Service
public class SocioServiceImpl implements SocioService {

    @Autowired
    private SocioRepository socioRepository; 

    @Autowired
    private SocioDTOConvert socioConvert;

    @Override
    public List<SocioDTO> findAll() {
        List<SocioEntity> socioEntities = (List<SocioEntity>) socioRepository.findAll();
        List<SocioDTO> socioDTOs = new ArrayList<>();
        for(SocioEntity socio: socioEntities){
            socioDTOs.add(socioConvert.convertSocioDTO(socio));
        }
        return socioDTOs;
    }

    @Override
    public void delete(Long id) {
        socioRepository.deleteById(id);
    }

    @Override
    public void save(SocioEntity socio){
        socioRepository.save(socio);
    }
    
}
