package abc.organizacionabc.dto;

import lombok.Data;

@Data
public class SocioDTO {

    private Long id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    
    private Long sedeId;
    private Long bancoId;
}
