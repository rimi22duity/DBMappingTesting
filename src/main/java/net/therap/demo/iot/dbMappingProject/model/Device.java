package net.therap.demo.iot.dbMappingProject.model;

import net.therap.demo.iot.dbMappingProject.model.data.DeviceData;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String deviceMacAddress;
    private String deviceName;
    private String deviceType;

    @ManyToOne
    private User assignedUser;

    @ManyToOne
    private User createdByUser;

    @OneToMany(mappedBy = "device")
    private List<DeviceData> dataList;

    public Device() {
        dataList = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeviceMacAddress() {
        return deviceMacAddress;
    }

    public void setDeviceMacAddress(String deviceMacAddress) {
        this.deviceMacAddress = deviceMacAddress;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public User getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(User createdByUser) {
        this.createdByUser = createdByUser;
    }

    public List<DeviceData> getDataList() {
        return dataList;
    }

    public void setDataList(List<DeviceData> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return getId() == device.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
