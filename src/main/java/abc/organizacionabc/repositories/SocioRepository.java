package abc.organizacionabc.repositories;

import org.springframework.data.repository.CrudRepository;

import abc.organizacionabc.repositories.enitities.SocioEntity;

public interface SocioRepository extends CrudRepository<SocioEntity,Long> {
    
}
