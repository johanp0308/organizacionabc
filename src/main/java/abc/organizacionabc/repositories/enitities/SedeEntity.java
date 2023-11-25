package abc.organizacionabc.repositories.enitities;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(
        name = "sede_envios",
        joinColumns = {@JoinColumn(name="id_sede")},
        inverseJoinColumns = {@JoinColumn(name="id_envio")}
    )
    private Set<EnvioEntity> envios;

    @OneToMany(mappedBy = "sede",cascade=CascadeType.ALL)
    private List<SocioEntity> socios;

    @JoinColumn(name = "director_id")
    @OneToOne(fetch = FetchType.LAZY)
    private DirectorEntity director;

}
