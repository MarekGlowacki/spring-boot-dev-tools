package online.javafun.springbootdevtools;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    String home(Model model) {
        model.addAttribute("message", "text controllera przed zmianą");
        return "index";
    }
}
