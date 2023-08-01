package team.medical.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import team.medical.healthcare.repository.UserRepository;
import team.medical.healthcare.repository.entity.UserInfoEntity;
import team.medical.healthcare.service.UserService;


@Service
@Validated
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(final UserRepository repository) {
        this.userRepository = repository;
    }

    @Override
    public UserInfoEntity getUserByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber).orElse(null);
    }

    @Override
    public UserInfoEntity findById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserInfoEntity addUser(UserInfoEntity user) {
        userRepository.save(user);
        return null;
    }

    @Override
    public Integer deleteUser(int id) {
        if(userRepository.findById(id).isPresent()){
            userRepository.deleteById(id);
        }
        else return 1;

        return 0;
    }

}
