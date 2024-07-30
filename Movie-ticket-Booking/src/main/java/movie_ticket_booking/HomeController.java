package movie_ticket_booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {
    
    @Autowired
    private ServiceUser service;

    @GetMapping("/")
    public String index() {
        return "index"; 
    }
    
    @PostMapping("/login")
    public String login(@Param("username") String username,@Param("password") String password) {
        return service.getLogin(username,password);
    }
    @GetMapping("/home")
    public String getMethodName() {
        return "welcome";
    }
    
    
}