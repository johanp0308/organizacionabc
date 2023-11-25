package abc.organizacionabc.dto;

import lombok.Data;

@Data
public class VoluntarioDTO {
    
    private Long id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;

    private String tipo_voluntario;
    private String profesion;
}
