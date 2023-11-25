package abc.organizacionabc.repositories.enitities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="director")
@Data
public class DirectorEntity extends PersonaEntity{
    
    private String titulo;

    @OneToOne(mappedBy = "director",cascade = CascadeType.ALL)
    private SedeEntity sede;
}
