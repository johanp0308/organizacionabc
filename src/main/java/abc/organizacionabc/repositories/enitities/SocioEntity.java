package abc.organizacionabc.repositories.enitities;

import java.util.List;

import jakarta.persistence.CascadeType;
// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="socio")
public class SocioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne()
    @JoinColumn(name = "persona_id")
    private PersonaEntity persona;

    @ManyToOne()
    @JoinColumn(name = "sede_id")
    private SedeEntity sede;

    @ManyToOne()
    @JoinColumn(name = "banco_id")
    private BancoEntity banco;

    @OneToMany(mappedBy = "socio",cascade = CascadeType.ALL)
    private List<CuotasEntity> cuotas;
}
