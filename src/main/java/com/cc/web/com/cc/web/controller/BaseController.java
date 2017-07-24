package com.cc.web.com.cc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenchen on 17-7-24.
 */
@Controller
public class BaseController {
    @RequestMapping("/index")
    public String test(){
        return "index";
    }
}
