package Namaste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NamasteWorldController {

    @RequestMapping("/hellospring")

    public String helloSpring(){
        return "index";
    }

}
