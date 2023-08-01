package team.medical.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import team.medical.healthcare.model.UserModel;
import team.medical.healthcare.repository.entity.UserInfoEntity;
import team.medical.healthcare.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getInfo/{id}")
    public ResponseEntity<UserInfoEntity> login(@PathVariable(name = "id") int id) {
        UserInfoEntity user = userService.findById(id);

        if (user == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);

        user.setPassword("");
        user.setSaltPassword("");
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/addUser")
    public ResponseEntity<UserInfoEntity> addUser(@RequestBody UserModel user){
        UserInfoEntity newUser = new UserInfoEntity();

        newUser.setPhoneNumber(user.getPhoneNumber());
        newUser.setPassword(user.getPassword());
        newUser.setDateOfBirth(user.getDateOfBirth());
        newUser.setGender(user.getGender());
        newUser.setJob(user.getJob());
        newUser.setMaritalStatus(user.getMaritalStatus());
        newUser.setIdentityCard(user.getIdentityCard());
        newUser.setInsuranceNumber(user.getInsuranceNumber());
        newUser.setEmail(user.getEmail());
        newUser.setAddressCity(user.getAddressCity());
        newUser.setAddressDistrict(user.getAddressDistrict());
        newUser.setAddressWard(user.getAddressWard());
        newUser.setAddressStreet(user.getAddressStreet());
        newUser.setAddressDetail(user.getAddressDetail());

        newUser.setRole(3);
        newUser.setSaltPassword("123");
        newUser.setUserName(user.getPhoneNumber());
        newUser.setEthnicId(1);
        newUser.setAvatarLink("url");

        userService.addUser(newUser);

        return ResponseEntity.ok().body(newUser);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable int id){
        UserInfoEntity i = userService.findById(id);
        if(i != null) {
            userService.deleteUser(id);
            return ResponseEntity.ok().body("deleted");
        }
        else
            return ResponseEntity.ok().body("User is not exist");
    }

}
