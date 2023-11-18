package abc.organizacionabc.repositories.enitities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="material")
public class MaterialEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo_material;

    @ManyToMany(
        mappedBy = "material",
        cascade ={
            CascadeType.PERSIST,
            CascadeType.MERGE
        })
    @JoinTable(
        name = "material_envio",
        joinColumns={@JoinColumn(name = "id_material")},
        inverseJoinColumns={@JoinColumn(name="id_envio")}
    )
    private Set<EnvioEntity> envios;
}