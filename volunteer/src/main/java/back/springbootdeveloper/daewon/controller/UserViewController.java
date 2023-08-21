package back.springbootdeveloper.daewon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/login/google")
    public String googlelogin(){
        return "googlelogin";
    }
    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }
    @GetMapping("/articles")
    public String articles(){
        return "articles";
    }
}
