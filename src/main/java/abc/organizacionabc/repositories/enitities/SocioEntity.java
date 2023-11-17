package abc.organizacionabc.repositories.enitities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="socio")
public class SocioEntity {

    private Long id_socio;
    private Long id_sede;
    private Long id_banco;
}
