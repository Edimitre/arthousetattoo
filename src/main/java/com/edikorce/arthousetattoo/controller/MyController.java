package com.edikorce.arthousetattoo.controller;


import com.edikorce.arthousetattoo.model.Painting;
import com.edikorce.arthousetattoo.model.Tattoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.edikorce.arthousetattoo.service.DatabaseService;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private DatabaseService service;

    @RequestMapping("/home")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/paintings")
    public String showAllPaintings(Model model){
        List<Painting> allPaintings = service.getAllPaintings();
        model.addAttribute("allPaintingsList", allPaintings);
        return "paintings";
    }


    @RequestMapping("/tattoos")
    public String showAllTattoos(Model model){
        List<Tattoo> allTattoos = service.getAllTattoos();
        model.addAttribute("allTattoosList", allTattoos);
        return "tattoos";
    }

}
