package abc.organizacionabc.services;

import java.util.List;

import abc.organizacionabc.dto.BancoDTO;

public interface BancoService {

    List<BancoDTO> findAll();
    
}
