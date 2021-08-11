package Labs.relogioDePontoRest.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Audited
public class JornadaDeTrabalho {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String descricao;
}

