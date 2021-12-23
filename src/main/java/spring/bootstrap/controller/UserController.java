package spring.bootstrap.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring.bootstrap.entities.User;
import spring.bootstrap.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String pageMain() {
        return "redirect:/login";
    }

    @GetMapping(value = "/user")
    public String getUserPage(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user",user);
        return "user/userShowId";
    }
}
