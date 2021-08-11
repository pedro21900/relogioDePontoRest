package Labs.relogioDePontoRest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Usuario {
    @Id
    private long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String name;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelDeAcesso nivelDeAcesso;
    @ManyToOne
    private JornadaDeTrabalho jornadaDeTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime fimJornada;
}
