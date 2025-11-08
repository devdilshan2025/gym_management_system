package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class TrainerEntity {

    @Id
    private   String trainerId;
    private  String name;
    private  String address;
    private double salary;
    private String phoneNumber;
    private  String email;
    private LocalDate dob;
    private  int experienceYear;
    private String qualification;


}
