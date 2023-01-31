package net.therap.demo.iot.dbMappingProject.service;

import net.therap.demo.iot.dbMappingProject.model.SmartPlugData;
import net.therap.demo.iot.dbMappingProject.repo.SmartPlugDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartPlugDataService {

    @Autowired
    SmartPlugDataRepo smartPlugDataRepository;

    public void save(SmartPlugData smartPlugData) {
        smartPlugDataRepository.save(smartPlugData);
    }
}
