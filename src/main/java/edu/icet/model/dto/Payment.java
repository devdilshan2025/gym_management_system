package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment {

    private  String paymentId;
    private   double amount;
    private LocalDate payDate;
}
