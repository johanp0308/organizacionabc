package abc.organizacionabc.repositories.enitities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    @JoinColumn(name = "socio_id")
    private SocioEntity socio;
    
}
