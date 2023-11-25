package abc.organizacionabc.dto;

import java.util.Date;

import lombok.Data;

@Data
public class EnvioDTO {
    private Long id;
    private Date fecha_envio;
    private String direccion_destino;
}
