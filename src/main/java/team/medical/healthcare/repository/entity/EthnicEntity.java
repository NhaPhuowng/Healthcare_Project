package team.medical.healthcare.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ethnic")
public class EthnicEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ethnic_id", nullable = false)
    private int ethnicId;
    
    @Column(name = "ethnic_name", length = 100)
    private String ethnicName;
    
    @Column(name = "index_num")
    private Integer indexNum;
    
    @Column(name = "is_active", nullable = false)
    private byte isActive;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthnicEntity that = (EthnicEntity) o;
        return ethnicId == that.ethnicId && isActive == that.isActive && Objects.equals(ethnicName, that.ethnicName) && Objects.equals(indexNum, that.indexNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ethnicId, ethnicName, indexNum, isActive);
    }
}
