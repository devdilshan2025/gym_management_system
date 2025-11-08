package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {

    private String Memberid;
    private String name;
    private String email;
    private String address;
    private LocalDateTime dob;
    private  double BMI;
    private  String phonenumber;
    private  double registrationFee;
    private String subscription;


}
