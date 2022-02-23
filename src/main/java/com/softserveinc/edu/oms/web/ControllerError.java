package com.softserveinc.edu.oms.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
public class ControllerError {
    @GetMapping("hello")
    public String handleLogin() {

        return "hello";
    }
}
