package abc.organizacionabc.repositories.enitities;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cuotas")
public class CuotasEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha_pago;
    private String tipo_cuota;
    private float cargo_anual;
    
    @ManyToOne()
    @JsonIgnoreProperties("id_socio")
    private SocioEntity id_socio;
    
}
