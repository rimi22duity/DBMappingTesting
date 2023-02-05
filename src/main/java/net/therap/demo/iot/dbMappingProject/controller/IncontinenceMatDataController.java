package net.therap.demo.iot.dbMappingProject.controller;

import net.therap.demo.iot.dbMappingProject.commandObj.dataObj.IncontinenMattDataCmd;
import net.therap.demo.iot.dbMappingProject.model.Device;
import net.therap.demo.iot.dbMappingProject.model.data.IncontinenceMattData;
import net.therap.demo.iot.dbMappingProject.service.DeviceService;
import net.therap.demo.iot.dbMappingProject.service.IncontinenceMattDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncontinenceMatDataController {

    @Autowired
    private IncontinenceMattDataService incontinenceMattDataService;

    @Autowired
    private DeviceService deviceService;

    @PostMapping("/saveImData")
    public String saveImData(@RequestBody IncontinenMattDataCmd incontinenMattDataCmd) {

        Device device = deviceService.findByMacAddress(incontinenMattDataCmd.getDeviceMacAddress());

        IncontinenceMattData incontinenceMattData = new IncontinenceMattData();
        incontinenceMattData.setCompanyName(incontinenMattDataCmd.getCompanyName());
        incontinenceMattData.setStatus(incontinenMattDataCmd.getStatus());
        incontinenceMattData.setDevice(device);

        incontinenceMattDataService.save(incontinenceMattData);

        return "saved successfully!";
    }
}
