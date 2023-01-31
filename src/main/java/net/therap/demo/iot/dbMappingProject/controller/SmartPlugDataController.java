package net.therap.demo.iot.dbMappingProject.controller;

import net.therap.demo.iot.dbMappingProject.model.SmartPlugData;
import net.therap.demo.iot.dbMappingProject.service.SmartPlugDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmartPlugDataController {

    @Autowired
    SmartPlugDataService smartPlugDataService;

    @GetMapping("/saveSpData")
    public String saveSpData(@RequestBody SmartPlugData smartPlugData) {
        smartPlugDataService.save(smartPlugData);

        return "saved successfully!";
    }
}
