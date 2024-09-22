package ru.neoflex.vacationcalc.services;

import org.springframework.stereotype.Service;
import ru.neoflex.vacationcalc.models.VacationPay;

@Service
public class VacationPayService {
    public VacationPay getVacationPay(int days, double salary) {
        return VacationPayCreator.create(days, salary);
    }

}
