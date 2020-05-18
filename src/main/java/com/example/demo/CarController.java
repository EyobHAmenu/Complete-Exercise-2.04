package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class CarController {
    @GetMapping("/carform")
    public String loadCarForm(Model model){
        model.addAttribute("car", new Car());
        return "carForm";
    }
    @PostMapping("/carform")
    public String processForm(@Valid Car car, BindingResult result){
        if(result.hasErrors()){
            return "carForm";
        }
        return "confirmation";
    }
}
