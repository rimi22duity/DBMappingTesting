package net.therap.demo.iot.dbMappingProject.commandObj.dataObj;

public class SmartPlugDataCmd {

    private String deviceMacAddress;
    private String companyName;
    private int currentAmp;

    public String getDeviceMacAddress() {
        return deviceMacAddress;
    }

    public void setDeviceMacAddress(String deviceMacAddress) {
        this.deviceMacAddress = deviceMacAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCurrentAmp() {
        return currentAmp;
    }

    public void setCurrentAmp(int currentAmp) {
        this.currentAmp = currentAmp;
    }
}
