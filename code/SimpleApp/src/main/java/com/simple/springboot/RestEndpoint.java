package com.simple.springboot;

import com.simple.datastructures.CompanyContact;
import com.simple.datastructures.Contract;
import com.simple.datastructures.DataManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/contracts")
public class RestEndpoint {
    @GetMapping("/company")
    public List<Contract> getData(@RequestParam String item) {
        List<Contract> filteredData = new ArrayList<>();
        try {
            int id = Integer.parseInt(item);

            for (Contract contract : DataManager.getContracts()) {
                CompanyContact contact = contract.getContact();
                if (contact.company().id() == id) {
                    filteredData.add(contract);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid id");
        }

        return filteredData;
    }
}