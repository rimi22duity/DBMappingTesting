package net.therap.demo.iot.dbMappingProject.model;

import net.therap.demo.iot.dbMappingProject.model.data.DeviceData;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String userName;
    private String userRole;

    @OneToMany(mappedBy = "assignedUser")
    private List<Device> devices;

    @OneToMany
    private List<Device> createdDevices;

    public User() {
        devices = new ArrayList<>();
        createdDevices = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Device> getCreatedDevices() {
        return createdDevices;
    }

    public void setCreatedDevices(List<Device> createdDevices) {
        this.createdDevices = createdDevices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
