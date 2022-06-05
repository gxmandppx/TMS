package top.imengying.tms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @RequestMapping("/book/book-list")
    public String book(){
        return "book/book-list";
    }
}
