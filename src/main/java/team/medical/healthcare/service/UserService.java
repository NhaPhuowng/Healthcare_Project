package team.medical.healthcare.service;

import team.medical.healthcare.repository.entity.UserInfoEntity;


public interface UserService {

    UserInfoEntity getUserByPhoneNumber(String phoneNumber);
    UserInfoEntity findById(int id);

    UserInfoEntity addUser(UserInfoEntity user);

    Integer deleteUser(int id);
}
