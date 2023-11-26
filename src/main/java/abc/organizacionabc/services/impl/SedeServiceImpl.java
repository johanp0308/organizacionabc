package abc.organizacionabc.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abc.organizacionabc.config.SedeDTOConvert;
import abc.organizacionabc.dto.SedeDTO;
import abc.organizacionabc.repositories.SedeRepository;
import abc.organizacionabc.repositories.enitities.SedeEntity;
import abc.organizacionabc.services.SedeService;

@Service
public class SedeServiceImpl implements SedeService{
    
    @Autowired
    private SedeRepository sedeRepository;

    @Autowired
    private SedeDTOConvert sedeConvert;

    @Override
    public List<SedeDTO> findAll() {
        List<SedeEntity> sedeEntities = (List<SedeEntity>) sedeRepository.findAll();
        List<SedeDTO> sedeDtos = new ArrayList<>();
        for(SedeEntity sede: sedeEntities){
            sedeDtos.add(sedeConvert.convertSedeDTO(sede));
        }
        return sedeDtos;
    }

    @Override
    public void deletById(Long id) {
        sedeRepository.deleteById(id);
    }

    @Override
    public void save(SedeEntity sede) {
        sedeRepository.save(sede);
    }

}
