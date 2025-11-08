package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class shedule {

    private  String scheduleId;
    private LocalDate startDate;
    private  LocalDate endDate;
    private  String timeDuration;

}
