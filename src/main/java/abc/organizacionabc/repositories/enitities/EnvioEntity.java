package abc.organizacionabc.repositories.enitities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="envio")
public class EnvioEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha_envio;
    private String direccionDestino;

    @OneToMany(mappedBy = "envio", cascade=CascadeType.ALL)
    private List<VoluntarioEntity> voluntarios;
    
    @OneToMany(mappedBy = "envio",cascade = CascadeType.ALL)
    private List<MaterialEntity> materiales;

}

