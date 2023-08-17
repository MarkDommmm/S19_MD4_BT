package ra.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.controller.Model.Person;

@Controller
@RequestMapping("/")
public class DemoController {
    @GetMapping("/")
    public String home(Model model) {
        Person p = new Person(1,"Giang Ga`",30,"TN");
        model.addAttribute("p",p);
        return "home";
    }

}