package net.therap.demo.iot.dbMappingProject.service;

import net.therap.demo.iot.dbMappingProject.model.Device;
import net.therap.demo.iot.dbMappingProject.model.User;
import net.therap.demo.iot.dbMappingProject.repo.DeviceRepo;
import net.therap.demo.iot.dbMappingProject.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void save(User user) {
        userRepo.save(user);
    }

    public User findById(long userId) {
        return userRepo.findById(userId).get();
    }
}
