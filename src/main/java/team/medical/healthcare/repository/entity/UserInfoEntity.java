package team.medical.healthcare.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user_info")
public class UserInfoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false)
    private int userId;
    
    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;
    
    @Column(name = "role")
    private Integer role;
    
    @Column(name = "user_patient_id", length = 20)
    private String userPatientId;
    
    @Column(name = "phone_number", nullable = false, length = 20)
    private String phoneNumber;
    
    @Column(name = "date_of_birth", nullable = false)
    private Timestamp dateOfBirth;
    
    @Column(name = "gender", nullable = false)
    private int gender;
    
    @Column(name = "marital_status", length = 30)
    private String maritalStatus;
    
    @Column(name = "job", length = 50)
    private String job;
    
    @Column(name = "identity_card", nullable = false, length = 20)
    private String identityCard;
    
    @Column(name = "insurance_number", length = 20)
    private String insuranceNumber;
    
    @Column(name = "email", length = 100)
    private String email;
    
    @Column(name = "address_city")
    private Integer addressCity;
    
    @Column(name = "address_district")
    private Integer addressDistrict;
    
    @Column(name = "address_ward")
    private Integer addressWard;
    
    @Column(name = "address_street")
    private Integer addressStreet;
    
    @Column(name = "address_detail", length = 200)
    private String addressDetail;
    
    @Column(name = "ethnic_id")
    private Integer ethnicId;
    
    @Column(name = "avatar_link", length = 100)
    private String avatarLink;
    
    @Column(name = "is_active", nullable = false)
    private byte isActive;
    
    @Column(name = "is_verify", nullable = false)
    private byte isVerify;
    
    @Column(name = "password", nullable = false, length = 100)
    private String password;
    
    @Column(name = "salt_password", nullable = false, length = 100)
    private String saltPassword;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfoEntity that = (UserInfoEntity) o;
        return userId == that.userId && gender == that.gender && isActive == that.isActive && isVerify == that.isVerify && Objects.equals(userName, that.userName) && Objects.equals(role, that.role) && Objects.equals(userPatientId, that.userPatientId) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(maritalStatus, that.maritalStatus) && Objects.equals(job, that.job) && Objects.equals(identityCard, that.identityCard) && Objects.equals(insuranceNumber, that.insuranceNumber) && Objects.equals(email, that.email) && Objects.equals(addressCity, that.addressCity) && Objects.equals(addressDistrict, that.addressDistrict) && Objects.equals(addressWard, that.addressWard) && Objects.equals(addressStreet, that.addressStreet) && Objects.equals(addressDetail, that.addressDetail) && Objects.equals(ethnicId, that.ethnicId) && Objects.equals(avatarLink, that.avatarLink) && Objects.equals(password, that.password) && Objects.equals(saltPassword, that.saltPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, role, userPatientId, phoneNumber, dateOfBirth, gender, maritalStatus, job, identityCard, insuranceNumber, email, addressCity, addressDistrict, addressWard, addressStreet, addressDetail, ethnicId, avatarLink, isActive, isVerify, password, saltPassword);
    }
}
