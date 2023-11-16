package abc.organizacionabc.repositories;

import org.springframework.data.repository.CrudRepository;

import abc.organizacionabc.repositories.enitities.PersonaEntity;

public interface PersonaRepository extends CrudRepository<PersonaEntity,Long>{
    
}
