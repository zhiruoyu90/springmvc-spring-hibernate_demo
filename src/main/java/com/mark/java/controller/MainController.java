package com.mark.java.controller;

import com.mark.java.entity.User;
import com.mark.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Created by mark on 4/24/15.
 */

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String add(HttpServletRequest request){
        List<User> us = new ArrayList<>();
        User u = new User();
        u.setUsername(request.getParameter("username"));
        us.add(u);
        userService.saveUsers(us);
        return "redirect:/index";
    }

    @RequestMapping("/index")
//    @ResponseBody
    public String index(Map<String, List<User>> context, Model model){
        List<User> list = userService.getAllUsernames();
        model.addAttribute("subject", "标题：");
        context.put("userList", list);
        return "index";
    }

}
