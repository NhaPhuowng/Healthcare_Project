package team.medical.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import team.medical.healthcare.model.LoginModel;
import team.medical.healthcare.repository.entity.UserInfoEntity;
import team.medical.healthcare.service.UserService;

import java.util.Objects;

@Controller
@RequestMapping("/medical")
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<UserInfoEntity> login(@RequestBody LoginModel loginModel) {
        UserInfoEntity user = userService.getUserByPhoneNumber(loginModel.getPhoneNumber());

        if (user == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);

        String password = user.getPassword();
        if (!Objects.equals(password, loginModel.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }

        user.setPassword("");
        user.setSaltPassword("");
        return ResponseEntity.ok().body(user);
    }
}
