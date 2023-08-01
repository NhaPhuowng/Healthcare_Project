package team.medical.healthcare.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginModel {
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("password")
    private String password;
}
