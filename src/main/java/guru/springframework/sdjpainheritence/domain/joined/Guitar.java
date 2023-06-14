package guru.springframework.sdjpainheritence.domain.joined;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Guitar extends Instrument{
    private Integer numberOfStrings;
}
