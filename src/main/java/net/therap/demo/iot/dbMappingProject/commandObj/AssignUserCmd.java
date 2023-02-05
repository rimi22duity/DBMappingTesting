package net.therap.demo.iot.dbMappingProject.commandObj;

public class AssignUserCmd {

    private long userId;
    private String deviceMacAddress;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDeviceMacAddress() {
        return deviceMacAddress;
    }

    public void setDeviceMacAddress(String deviceMacAddress) {
        this.deviceMacAddress = deviceMacAddress;
    }
}
