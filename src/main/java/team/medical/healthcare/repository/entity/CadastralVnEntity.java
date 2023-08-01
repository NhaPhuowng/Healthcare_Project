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
@Table(name = "cadastral_vn")
public class CadastralVnEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cadastral_id")
    private int cadastralId;
    
    @Column(name = "cadastral_code")
    private String cadastralCode;
    
    @Column(name = "cadastral_name")
    private String cadastralName;
    
    @Column(name = "parent_code")
    private String parentCode;
    
    @Column(name = "int_order")
    private Integer intOrder;
    
    @Column(name = "cadastral_type")
    private Integer cadastralType;
    
    @Column(name = "sDesc")
    private String sDesc;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CadastralVnEntity that = (CadastralVnEntity) o;
        return cadastralId == that.cadastralId && Objects.equals(cadastralCode, that.cadastralCode) && Objects.equals(cadastralName, that.cadastralName) && Objects.equals(parentCode, that.parentCode) && Objects.equals(intOrder, that.intOrder) && Objects.equals(cadastralType, that.cadastralType) && Objects.equals(sDesc, that.sDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadastralId, cadastralCode, cadastralName, parentCode, intOrder, cadastralType, sDesc);
    }
}
