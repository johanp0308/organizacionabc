package abc.organizacionabc.repositories.enitities;


import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="persona")
@Data
public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;

    @OneToOne(mappedBy = "persona",cascade = CascadeType.ALL)
    private SedeEntity sede;

    @OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
    private List<SocioEntity> socios;

    @OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
    private List<VoluntarioEntity> voluntarios;
    
}
