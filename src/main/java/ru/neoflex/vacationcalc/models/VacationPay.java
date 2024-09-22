package ru.neoflex.vacationcalc.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
@Setter
public class VacationPay {

    private double salary;
    private int days;
    private double size;

}
