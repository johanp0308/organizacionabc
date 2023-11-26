package abc.organizacionabc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import abc.organizacionabc.dto.SocioDTO;
import abc.organizacionabc.repositories.enitities.SocioEntity;
import abc.organizacionabc.services.SocioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/socio")
public class SocioController {
    
    @Autowired
    private SocioService socioService;

    @GetMapping(value="/")
    public List<SocioDTO> findAll() {
        return (List<SocioDTO>)socioService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletById(@PathVariable Long id){
        socioService.delete(id);
    }

    // Si quieres actualizar manda en el JSON el id del que se desea actualizar
    @PostMapping(value="/")
    public void save(@RequestBody SocioEntity socio) {
        //SocioEntitysocio process POST request
        socioService.save(socio);
    }
    


}
