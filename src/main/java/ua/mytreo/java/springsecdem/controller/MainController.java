package ua.mytreo.java.springsecdem.controller;

/**
 * Created by 1 on 25.03.2016.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model){
        return "index";
    }

    @RequestMapping(value ="/login",method = RequestMethod.GET)
    public String loginPage(Model model){
        return "login";
    }

    @RequestMapping(value ="/userPages",method = RequestMethod.GET)
    public String userPagesPage(Model model){
        return "userPages";
    }

}