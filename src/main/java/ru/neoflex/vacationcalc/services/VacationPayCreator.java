package ru.neoflex.vacationcalc.util;

import ru.neoflex.vacationcalc.models.VacationPay;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VacationPayCreator {
    public static VacationPay create(int vacationDays, double salary) {
        VacationPay vacationPay = new VacationPay();
        vacationPay.setSalary(salary);
        vacationPay.setDays(vacationDays);
        vacationPay.setSize(getVacationPaySize(vacationDays, salary));

        return vacationPay;
    }
    
    private static double getVacationPaySize(int vacationDays, double salary) {
        BigDecimal result = new BigDecimal(salary / Constants.AVERAGE_DAYS_PER_MONTH * vacationDays);
        result = result.setScale(2, RoundingMode.HALF_UP);
        return result.doubleValue();
    }

}
