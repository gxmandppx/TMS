package top.imengying.tms.Controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.imengying.tms.Entity.User;
import top.imengying.tms.Service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
//    @Resource
//    UserService userService;
//    @RequestMapping("/user/userList")
//    public String userList(Model model) {
//        List<User> users = userService.findAll();
//        model.addAttribute("users", users);
//        return "user/userList";
//    }
//    @PostMapping("/update")
//    public String update(User user) {
//        userService.update(user);
//        return "redirect:/user/userList";
//    }
}
