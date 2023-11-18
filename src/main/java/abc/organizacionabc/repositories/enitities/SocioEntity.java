package abc.organizacionabc.repositories.enitities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="socio")
public class SocioEntity {

    @Column(name = "id_socio")
    @ManyToOne()
    private SocioEntity socio;

    @ManyToOne
    @Column(name = "id_sede")
    private SedeEntity sede;

    @ManyToOne()
    @Column(name = "id_banco")
    private BancoEntity banco;
}
