package top.imengying.tms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.imengying.tms.Entity.User;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
//    @RequestMapping("/doLogin")
//    public String doLogin(HttpServletRequest request) {
//        String username=request.
//        User user=request.login(username,password);
//    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("login")
    public String doLogin(){
        return "login";
    }
    @RequestMapping("/doRegister")
    public String doRegister(){
        return "register";
    }
    @RequestMapping("/register")
    public String Register(User user)
    {
        return "doLogin";
    }
}
