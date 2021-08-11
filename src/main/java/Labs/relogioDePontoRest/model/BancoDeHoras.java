package Labs.relogioDePontoRest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BancoDeHoras {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class DhId implements Serializable {
        private long idDh;
        private long idMovimento;
        private long idUsuario;
    }
    @Id
    @EmbeddedId
    private DhId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal qtdHorasTrabalhadas;
    private BigDecimal saldoHorasTrabalhadas;
}
