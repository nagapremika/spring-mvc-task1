package com.stackroute.exercise1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {       //Controller


    @RequestMapping("/")        //Handles the request mapping with "/"
    public String greet(Model model){
        User user = new User("Premika");
        model.addAttribute("message",user.getMessage());        //prints the message
        return "index";
    }

}
