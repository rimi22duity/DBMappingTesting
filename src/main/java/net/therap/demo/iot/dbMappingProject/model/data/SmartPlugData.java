package net.therap.demo.iot.dbMappingProject.model.data;

import com.sun.istack.NotNull;

import javax.persistence.Entity;

@Entity
public class SmartPlugData extends DeviceData {

    @NotNull
    private int currentAmp;

    public int getCurrentAmp() {
        return currentAmp;
    }

    public void setCurrentAmp(int currentAmp) {
        this.currentAmp = currentAmp;
    }
}
