package abc.organizacionabc.repositories.enitities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="voluntario")
@Data
public class VoluntarioEntity extends PersonaEntity{
    
    private String tipo_voluntario;
    private String profesion;

    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
    @JoinTable(
        name = "voluntario_envio",
        joinColumns = {@JoinColumn(name="id_voluntario")},
        inverseJoinColumns = {@JoinColumn(name="id_envio")}
    )
    private List<EnvioEntity> envios;
}
