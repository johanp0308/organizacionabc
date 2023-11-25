package abc.organizacionabc.repositories.enitities;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
// import jakarta.persistence.OneToOne;
import lombok.Data;


@Data
@MappedSuperclass
public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;

}
