package abc.organizacionabc.repositories.enitities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="sede")
public class SedeEntity {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String ciudad;
    private String direccion;
    private String pais;
    private String estado;

    /* Foreign keys  */
    @OneToMany(mappedBy = "sede", cascade = CascadeType.ALL)
    private List<EnvioEntity> envios;

    @OneToMany(mappedBy = "sede",cascade=CascadeType.ALL)
    private List<SocioEntity> socios;

    @OneToOne
    @JoinColumn(name = "director")
    private PersonaEntity director;
}
