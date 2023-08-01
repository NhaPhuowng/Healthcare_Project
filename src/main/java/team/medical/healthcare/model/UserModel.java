package team.medical.healthcare.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
public class UserModel {

    @Id
    @JsonProperty
    private int userId;

    @JsonProperty
    private String username;

    @JsonProperty
    private int role;

    @JsonProperty
    private String userPatientId;

    @JsonProperty
    private String phoneNumber;

    @JsonProperty
    private Timestamp dateOfBirth;

    @JsonProperty
    private int gender;

    @JsonProperty
    private String maritalStatus;

    @JsonProperty
    private String job;

    @JsonProperty
    private String identityCard;

    @JsonProperty
    private String insuranceNumber;

    @JsonProperty
    private String email;

    @JsonProperty
    private Integer addressCity;

    @JsonProperty
    private Integer addressDistrict;

    @JsonProperty
    private Integer addressWard;

    @JsonProperty
    private Integer addressStreet;

    @JsonProperty
    private String addressDetail;

    @JsonProperty
    private Integer ethnicId;

    @JsonProperty
    private String avatarLink;

    @JsonProperty
    private String password;



}
