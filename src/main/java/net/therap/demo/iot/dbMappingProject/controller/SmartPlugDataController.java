package net.therap.demo.iot.dbMappingProject.controller;

import net.therap.demo.iot.dbMappingProject.commandObj.dataObj.SmartPlugDataCmd;
import net.therap.demo.iot.dbMappingProject.model.Device;
import net.therap.demo.iot.dbMappingProject.model.data.SmartPlugData;
import net.therap.demo.iot.dbMappingProject.service.DeviceService;
import net.therap.demo.iot.dbMappingProject.service.SmartPlugDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmartPlugDataController {

    @Autowired
    SmartPlugDataService smartPlugDataService;

    @Autowired
    DeviceService deviceService;

    @PostMapping("/saveSpData")
    public String saveSpData(@RequestBody SmartPlugDataCmd smartPlugDataCmd) {

        Device device = deviceService.findByMacAddress(smartPlugDataCmd.getDeviceMacAddress());

        SmartPlugData smartPlugData = new SmartPlugData();
        smartPlugData.setCompanyName(smartPlugDataCmd.getCompanyName());
        smartPlugData.setCurrentAmp(smartPlugDataCmd.getCurrentAmp());
        smartPlugData.setDevice(device);

        smartPlugDataService.save(smartPlugData);

        return "saved successfully!";
    }
}
