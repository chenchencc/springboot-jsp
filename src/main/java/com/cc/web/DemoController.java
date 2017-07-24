package com.cc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenchen on 17-7-24.
 */
@Controller
public class DemoController {

    @RequestMapping("/f")
    public String get(){
        return "first";
    }
}
