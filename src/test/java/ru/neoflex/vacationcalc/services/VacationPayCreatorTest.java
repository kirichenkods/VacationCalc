package ru.neoflex.vacationcalc.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacationPayCreatorTest {

    @Test
    void getVacationPaySize() {
        assertEquals(95563.14, VacationPayCreator.getVacationPaySize(28, 100000));
        assertEquals(47781.57, VacationPayCreator.getVacationPaySize(14, 100000));
        assertEquals(0.0, VacationPayCreator.getVacationPaySize(0, 100000));
        assertEquals(0.0, VacationPayCreator.getVacationPaySize(14, 0));
        assertEquals(0.0, VacationPayCreator.getVacationPaySize(0, 0));
    }
}