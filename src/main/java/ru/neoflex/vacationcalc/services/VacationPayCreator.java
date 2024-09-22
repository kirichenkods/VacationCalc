package ru.neoflex.vacationcalc.services;

import ru.neoflex.vacationcalc.models.VacationPay;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VacationPayCreator {

    public static final double AVERAGE_DAYS_PER_MONTH = 29.3;
    public static VacationPay create(int vacationDays, double salary) {
        VacationPay vacationPay = new VacationPay();
        vacationPay.setSalary(salary);
        vacationPay.setDays(vacationDays);
        vacationPay.setSize(getVacationPaySize(vacationDays, salary));

        return vacationPay;
    }

    protected static double getVacationPaySize(int vacationDays, double salary) {
        BigDecimal size = new BigDecimal(salary / AVERAGE_DAYS_PER_MONTH * vacationDays);
        size = size.setScale(2, RoundingMode.HALF_UP);
        return size.doubleValue();
    }

}
