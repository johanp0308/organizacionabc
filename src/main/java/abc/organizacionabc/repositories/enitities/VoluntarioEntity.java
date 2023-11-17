package abc.organizacionabc.repositories.enitities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="voluntario")
public class VoluntarioEntity {
    
    private PersonaEntity id_voluntario;

    private String tipo_voluntario;

    private String profesion;

    private List<EnvioEntity> envios;
    
}
