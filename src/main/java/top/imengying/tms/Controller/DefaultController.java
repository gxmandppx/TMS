package top.imengying.tms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 设置自动跳转主页
**/
@Controller
public class DefaultController {
    @RequestMapping("/")
    public String Default(){
        return "login";
    }
}
