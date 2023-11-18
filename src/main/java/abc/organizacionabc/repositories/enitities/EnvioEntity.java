package abc.organizacionabc.repositories.enitities;

import java.util.Date;
// import java.util.List;
import java.util.Set;

// import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
// import jakarta.persistence.OneToMany;
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
    private String direccion_destino;

    @ManyToMany(mappedBy = "envios")
    private Set<VoluntarioEntity> voluntarios;
    
    @ManyToMany(mappedBy = "envios")
    private Set<MaterialEntity> materiales;

    @ManyToOne()
    @JoinColumn(name="refugio_id")
    private RefugioEntity refugio;
}


