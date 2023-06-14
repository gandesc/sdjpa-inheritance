package guru.springframework.sdjpainheritence.domain.joined;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Piano extends Instrument{
    private Integer numberOfKeys;
}
