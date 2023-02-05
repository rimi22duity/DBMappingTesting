package net.therap.demo.iot.dbMappingProject.model.data;

import net.therap.demo.iot.dbMappingProject.model.Device;

import javax.persistence.*;

import java.util.Objects;

import static javax.persistence.GenerationType.AUTO;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class DeviceData {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

    private String companyName;

    @ManyToOne
    private Device device;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeviceData)) return false;
        DeviceData that = (DeviceData) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
