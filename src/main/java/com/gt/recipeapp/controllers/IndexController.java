package com.gt.recipeapp.controllers;

/*
    Created by gt at 2:34 PM on Tuesday, July 06, 2021.
    Project: recipeapp, Package: com.gt.recipeapp.controllers.
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage() {
        return "index";
    }
}
