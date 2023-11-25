package abc.organizacionabc.repositories.enitities;

import java.util.List;

import jakarta.persistence.CascadeType;
// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="socio")
public class SocioEntity extends PersonaEntity{

    @ManyToOne()
    @JoinColumn(name = "sede_id")
    private SedeEntity sede;

    @ManyToOne()
    @JoinColumn(name = "banco_id")
    private BancoEntity banco;

    @OneToMany(mappedBy = "socio",cascade = CascadeType.ALL)
    private List<CuotasEntity> cuotas;
}
