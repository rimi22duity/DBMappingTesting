package net.therap.demo.iot.dbMappingProject.model.data;

import net.therap.demo.iot.dbMappingProject.model.data.DeviceData;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class IncontinenceMattData extends DeviceData {

    @NotNull
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
