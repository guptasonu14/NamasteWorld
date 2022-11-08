package Namaste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NamasteWorldController {

    @RequestMapping("/hellospring")
    @ResponseBody
    public String helloSpring(){
        return "Hello Spring";
    }

}
