package org.example.lastecommmerse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainPage {
//    https://github.com/JavohirXatamov10/EcommerceWithSpringbootSecurity.git
    @ResponseBody
    @GetMapping
    public String test(){
        return "salom";
    }
}
