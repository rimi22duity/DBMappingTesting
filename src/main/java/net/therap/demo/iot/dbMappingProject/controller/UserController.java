package net.therap.demo.iot.dbMappingProject.controller;

import net.therap.demo.iot.dbMappingProject.model.User;
import net.therap.demo.iot.dbMappingProject.service.DeviceService;
import net.therap.demo.iot.dbMappingProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public String save(@RequestBody User user) {

        userService.save(user);
        return "saved Successfully";
    }
}
