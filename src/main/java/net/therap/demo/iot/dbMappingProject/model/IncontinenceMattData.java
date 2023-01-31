package net.therap.demo.iot.dbMappingProject.model;

import javax.persistence.Entity;

@Entity
public class IncontinenceMattData extends DeviceData {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
