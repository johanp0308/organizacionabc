package abc.organizacionabc.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abc.organizacionabc.config.BancoDTOConvert;
import abc.organizacionabc.dto.BancoDTO;
import abc.organizacionabc.repositories.BancoRepository;
import abc.organizacionabc.repositories.enitities.BancoEntity;
import abc.organizacionabc.services.BancoService;

@Service
public class BancoServiceImpl implements BancoService{

    @Autowired
    private BancoRepository bancoRepository;

    @Autowired
    private BancoDTOConvert convert;

    @Override
    public List<BancoDTO> findAll() {
        List<BancoEntity> bancoEntitys = (List<BancoEntity>) bancoRepository.findAll();
        List<BancoDTO> bancoDTOs = new ArrayList<>();

        for(BancoEntity banco : bancoEntitys){
            bancoDTOs.add(convert.convertBancoDTO(banco));
        }
        return bancoDTOs;
    }
    
}
