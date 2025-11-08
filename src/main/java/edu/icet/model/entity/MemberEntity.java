package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class MemberEntity {

    @Id
    private String Memberid;
    private String name;
    private String email;
    private String address;
    private LocalDateTime dob;
    private  double BMI;
    private  String phonenumber;
    private  double registrationFee;
    private  String subscription;


}
