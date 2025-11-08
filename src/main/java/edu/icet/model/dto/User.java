package edu.icet.model.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String userId;
    private  String userName;
    private String password;
    private  String role;
}
