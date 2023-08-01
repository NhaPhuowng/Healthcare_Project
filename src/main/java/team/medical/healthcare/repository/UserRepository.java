package team.medical.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import team.medical.healthcare.repository.entity.UserInfoEntity;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserInfoEntity, Integer> {
    @Query(value = "select u from UserInfoEntity u where u.phoneNumber = :phoneNumber")
    Optional<UserInfoEntity> findByPhoneNumber(String phoneNumber);
}
