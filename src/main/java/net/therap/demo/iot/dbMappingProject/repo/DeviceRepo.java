package net.therap.demo.iot.dbMappingProject.repo;

import net.therap.demo.iot.dbMappingProject.model.Device;
import org.springframework.data.repository.CrudRepository;

public interface DeviceRepo extends CrudRepository<Device, Long> {

    public Device findByDeviceMacAddress(String macAddress);
}
