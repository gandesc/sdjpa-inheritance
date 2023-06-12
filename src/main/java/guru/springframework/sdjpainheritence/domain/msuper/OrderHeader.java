package guru.springframework.sdjpainheritence.domain.msuper;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class OrderHeader extends BaseEntity{

    private String customerName;
}
