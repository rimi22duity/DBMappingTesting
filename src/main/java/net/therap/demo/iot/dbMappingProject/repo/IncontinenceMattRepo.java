package net.therap.demo.iot.dbMappingProject.repo;

import net.therap.demo.iot.dbMappingProject.model.data.IncontinenceMattData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncontinenceMattRepo extends CrudRepository<IncontinenceMattData, Long> {
}
