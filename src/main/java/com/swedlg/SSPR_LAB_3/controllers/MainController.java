package com.swedlg.SSPR_LAB_3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @PostMapping("/sum")
    public String calculateSum(@RequestParam String first_number,
                               @RequestParam String second_number,
                               Model model) {
        double result = Double.parseDouble(first_number) + Double.parseDouble(second_number);
        return String.valueOf(result);
    }

    @PostMapping("/subtraction")
    public String calculateSubtraction(@RequestParam String first_number,
                                       @RequestParam String second_number,
                                       Model model) {
        double result = Double.parseDouble(first_number) - Double.parseDouble(second_number);
        return String.valueOf(result);
    }

    @PostMapping("/multiplication")
    public String calculateMultiplication(@RequestParam String first_number,
                                          @RequestParam String second_number,
                                          Model model) {
        double result = Double.parseDouble(first_number) * Double.parseDouble(second_number);
        return String.valueOf(result);
    }

    @PostMapping("/division")
    public String calculateDivision(@RequestParam String first_number,
                                    @RequestParam String second_number,
                                    Model model) {
        double result = Double.parseDouble(first_number) / Double.parseDouble(second_number);
        return String.valueOf(result);
    }
}
