package lab2.starbucks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.RequestDispatcher;
import java.util.List;

@Controller
public class starbucksController {

    @GetMapping("/")
    public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        String roast = request.getParameter("roast");

        DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
        List<String> advice = data.getAdvice(roast);
        //String adviceOutput = prepareAdviceOutput(roast, advice);

        request.setAttribute("roast", roast.toUpperCase() );
        request.setAttribute("advices", advice);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("../display.jsp");
        requestDispatcher.forward(request, response);
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


