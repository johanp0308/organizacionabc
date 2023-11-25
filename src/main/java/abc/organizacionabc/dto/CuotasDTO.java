package abc.organizacionabc.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CuotasDTO {
    private Long id;
    private Date fecha_pago;
    private float cargo_anual;
    private Long socioId;
}
