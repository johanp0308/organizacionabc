package abc.organizacionabc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import abc.organizacionabc.dto.SedeDTO;
import abc.organizacionabc.repositories.enitities.SedeEntity;
import abc.organizacionabc.services.SedeService;

@RestController
@RequestMapping("/sede")
public class SedeController {
    
    @Autowired
    private SedeService sedeService;

    @GetMapping("/")
    public List<SedeDTO> findAll(){
        return (List<SedeDTO>)sedeService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletById(@PathVariable Long id){
        sedeService.deletById(id);
    }

    @PostMapping("/")
    public void save(@RequestBody SedeEntity sede){
        sedeService.save(sede);
    }
}
