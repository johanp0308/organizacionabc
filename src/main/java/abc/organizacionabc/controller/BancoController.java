package abc.organizacionabc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import abc.organizacionabc.dto.BancoDTO;
import abc.organizacionabc.services.BancoService;

@RestController
@RequestMapping("/banco")
public class BancoController {
    
    @Autowired
    private BancoService bancoService;

    @GetMapping("/")
    public List<BancoDTO> findAll(){
        return bancoService.findAll();
    }
}
