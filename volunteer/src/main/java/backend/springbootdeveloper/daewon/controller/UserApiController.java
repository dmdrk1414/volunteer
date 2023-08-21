package backend.springbootdeveloper.daewon.controller;

import backend.springbootdeveloper.daewon.dto.AddUserRequest;
import backend.springbootdeveloper.daewon.service.TokenService;
import backend.springbootdeveloper.daewon.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Controller
public class UserApiController {

    private final UserService userService;
    private final TokenService tokenService;

    @PostMapping("/signup")
    public String signup(AddUserRequest request){
        userService.save(request);
        return "redirect:/login";
    }

    @PostMapping("/login/123")
    public String login(@RequestBody AddUserRequest request){
//        User user = userService.findByEmail(request.getEmail());
//        String email = user.getEmail();
        System.out.println();
        System.out.println("sdfdsfsdf");
        //return tokenService.NewAccessToken("1@1");
        return "123";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response){
        new SecurityContextLogoutHandler().logout(request, response,
                SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
    }
}

