package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class UserEntity {

    @Id
    private String userId;
    private  String userName;
    private String password;
    private  String role;
}
