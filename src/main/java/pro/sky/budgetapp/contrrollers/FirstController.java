package pro.sky.budgetapp.contrrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String helloWorld() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String page() {
        return "Name: Inna Serebriakova; " +
                "\ntitle: Budget; " +
                "\ndate of project creation: 13.03.2023; " +
                "\ndescription: " +  "<http://../../resources/README.md";
    }
}
