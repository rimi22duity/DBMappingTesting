package net.therap.demo.iot.dbMappingProject.model;

import javax.persistence.Entity;

@Entity
public class SmartPlugData extends DeviceData {

    private int currentAmp;

    public int getCurrentAmp() {
        return currentAmp;
    }

    public void setCurrentAmp(int currentAmp) {
        this.currentAmp = currentAmp;
    }
}
