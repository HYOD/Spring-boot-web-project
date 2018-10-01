package com.didispace.web;

import com.didispace.model.User;
import com.didispace.sercie.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    UserServiceimpl userServiceimpl;

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "<html><h1 style='color:red'>Hello World Get</h1></html>";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(User user) { return userServiceimpl.addUser(user); }

    @RequestMapping(method = RequestMethod.PUT)
    public String put() {
        return "Hello World put";
    }

    @RequestMapping(    method = RequestMethod.DELETE)
    public String delete() {
        return "Hello World delete";
    }
}