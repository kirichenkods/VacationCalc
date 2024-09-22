package ru.neoflex.vacationcalc.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.neoflex.vacationcalc.dto.VacationPayDTO;
import ru.neoflex.vacationcalc.services.VacationPayService;

import javax.validation.constraints.Min;


@RestController
@RequestMapping("/calculacte")
@Validated
public class VacationPayController {
    private final VacationPayService vacationPayService;
    private final ModelMapper modelMapper;

    @Autowired
    public VacationPayController(VacationPayService vacationPayService, ModelMapper modelMapper) {
        this.vacationPayService = vacationPayService;
        this.modelMapper = modelMapper;
    }

    @GetMapping()
    public VacationPayDTO doCalculate(@RequestParam(value = "days") @Min(1) int days,
                                      @RequestParam(value = "salary") @Min(1) double salary) {

        return modelMapper.map(vacationPayService.getVacationPay(days, salary), VacationPayDTO.class);
    }
}
