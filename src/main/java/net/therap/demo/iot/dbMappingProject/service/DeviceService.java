package net.therap.demo.iot.dbMappingProject.service;

import net.therap.demo.iot.dbMappingProject.model.Device;
import net.therap.demo.iot.dbMappingProject.repo.DeviceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepo deviceRepo;

    public void save(Device device) {
        deviceRepo.save(device);
    }

    public Device findByMacAddress(String macAddress) { return deviceRepo.findByDeviceMacAddress(macAddress); }
}