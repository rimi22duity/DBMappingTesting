package net.therap.demo.iot.dbMappingProject.repo;

import net.therap.demo.iot.dbMappingProject.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
