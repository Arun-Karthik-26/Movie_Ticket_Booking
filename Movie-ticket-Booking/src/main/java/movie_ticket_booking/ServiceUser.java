package movie_ticket_booking;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser{

    @Autowired private UserRepository rep;
    public String getLogin(String username,String password){
        if(username==null||password==null){
            return "/";
        }
        else if (rep != null){
            List<User> log = (List<User>) rep.findAll();
            int c = 1;
            for (int i = 0; i < log.size(); i++) {
                User m = log.get(i);
                if (m.getUsername().compareTo(username) == 0 && m.getPassword().compareTo(password) == 0) {
                    c = 0;
                    break;
                }
            }
            if (c==0){
                return "redirect:/home";
            } else {
                return "redirect:/";
            }
        }
        else{
            return "/";
        }
    }
}