package net.therap.demo.iot.dbMappingProject.controller;

import net.therap.demo.iot.dbMappingProject.model.IncontinenceMattData;
import net.therap.demo.iot.dbMappingProject.model.SmartPlugData;
import net.therap.demo.iot.dbMappingProject.service.IncontinenceMattDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncontinenceMatDataController {

    @Autowired
    IncontinenceMattDataService incontinenceMattDataService;

    @GetMapping("/saveImData")
    public String saveSpData(@RequestBody IncontinenceMattData incontinenceMattData) {
        incontinenceMattDataService.save(incontinenceMattData);

        return "saved successfully!";
    }
}
