package cn.thb.controller;

import cn.thb.pojo.User;
import cn.thb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    //面向切面编程
    @Autowired
    private IUserService userService;

    @RequestMapping("list")
    public String list(HttpServletRequest request){
        List<User> users = userService.listAll();
        request.setAttribute("users",users);
        return "list";
    }

    @RequestMapping("find")
    public void findOne(int id){
        User user = userService.findById(id);
        System.out.println(user);
    }

    @RequestMapping("update")
    public void update(User user){
        System.out.println(userService.update(user));
    }
    @RequestMapping("delete")
    public void delete(User user,Model m)
    {
        Integer delete = userService.delete(user);
        m.addAttribute("delete",delete);
    }
}
