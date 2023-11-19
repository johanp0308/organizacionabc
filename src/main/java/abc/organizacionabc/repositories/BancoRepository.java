package abc.organizacionabc.repositories;

import org.springframework.data.repository.CrudRepository;

import abc.organizacionabc.repositories.enitities.BancoEntity;

public interface BancoRepository extends CrudRepository<BancoEntity,Long>{
    
}
