package com.simple.springboot;

import com.simple.datastructures.Company;
import com.simple.datastructures.CompanyContact;
import com.simple.datastructures.Contract;
import com.simple.datastructures.DataManager;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

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
