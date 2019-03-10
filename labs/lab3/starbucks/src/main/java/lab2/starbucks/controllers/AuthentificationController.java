package lab2.starbucks.controllers;

import lab2.starbucks.entity.Database;
import lab2.starbucks.entity.TestDataImpl;
import lab2.starbucks.respository.DataFacadeRepository;
import org.omg.CORBA.ServerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AuthentificationController {

    private Database data;
    @Autowired
    public void setDatabase(Database database) {
        this.data = database;
    }
    @GetMapping("/")
    public String login() {
        return "login";
    }


    @PostMapping("/calc")
    public String result(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        String expectedPassword = data.getPassword(name );

        if(expectedPassword == null || !expectedPassword.equals(password)) {
            return "index";
        }
        return "display";

    }
}
