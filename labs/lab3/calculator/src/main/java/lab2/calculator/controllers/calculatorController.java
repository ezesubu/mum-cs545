package lab2.calculator.controllers;

import lab2.calculator.dto.CalcDTO;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class calculatorController {

    @GetMapping("/")
    public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        return "home";
    }

    @GetMapping("/calc")
    public String calc( Model model) {
        return "calculator";
    }


    @PostMapping("/calc")
    public String result(@ModelAttribute CalcDTO calcDTO, Model model) {
        model.addAttribute("sum", calcDTO.getAdd1() + calcDTO.getAdd2());
        model.addAttribute("product", calcDTO.getMult1()* calcDTO.getMult2());
        return "result";
    }
}

