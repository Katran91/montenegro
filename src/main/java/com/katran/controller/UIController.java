package com.katran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by astratii on 4/7/2015.
 */
@Controller
public class UIController {
    @RequestMapping(value = "/")
    public String redirectToIndex(){
        return "redirect:/index.html";
    }

    @RequestMapping(value = "/prot")
    public String redirectToProtocol(){
        return "redirect:/protocol.html";
    }
}
