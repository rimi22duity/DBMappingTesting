package net.therap.demo.iot.dbMappingProject.repo;

import net.therap.demo.iot.dbMappingProject.model.data.SmartPlugData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartPlugDataRepo extends CrudRepository<SmartPlugData, Long> {
}
