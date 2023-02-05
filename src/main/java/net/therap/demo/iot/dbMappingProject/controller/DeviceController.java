package net.therap.demo.iot.dbMappingProject.controller;

import net.therap.demo.iot.dbMappingProject.commandObj.AssignUserCmd;
import net.therap.demo.iot.dbMappingProject.model.Device;
import net.therap.demo.iot.dbMappingProject.model.User;
import net.therap.demo.iot.dbMappingProject.service.DeviceService;
import net.therap.demo.iot.dbMappingProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private UserService userService;

    @PostMapping("/saveDevice")
    public String save(@RequestBody Device device) {

        User user = new User();
        user.setUserName("Fahim");
        user.setUserRole("Admin");
        userService.save(user);

        device.setCreatedByUser(user);
        deviceService.save(device);

        return "Saved Successfully";
    }

    @PostMapping("/assignUserToDevice")
    public String assignUserToDevice(@RequestBody AssignUserCmd assignUserCmd) {

        User user = userService.findById(assignUserCmd.getUserId());

        Device device = deviceService.findByMacAddress(assignUserCmd.getDeviceMacAddress());

        device.setAssignedUser(user);
        deviceService.save(device);

        return "Assigned Device: " + device.getId() +  " with User: " + user.getUserName();
    }
}
