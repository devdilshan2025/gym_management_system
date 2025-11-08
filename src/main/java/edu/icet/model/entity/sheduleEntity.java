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
public class sheduleEntity {

    @Id
    private  String scheduleId;
    private LocalDate startDate;
    private  LocalDate endDate;
    private  String timeDuration;

}
