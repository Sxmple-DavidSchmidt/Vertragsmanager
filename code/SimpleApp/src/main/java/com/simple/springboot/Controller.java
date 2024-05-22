package com.simple.springboot;

import com.simple.datastructures.DataManager;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/error")
    public String error() {
        return "Error/index.html";
    }

    @GetMapping("/")
    public String index() {
        return "Welcome/index.html";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("companies", DataManager.getCompanies());
        model.addAttribute("contracts", DataManager.getContracts());
        return "Dashboard/index.html";
    }
}
