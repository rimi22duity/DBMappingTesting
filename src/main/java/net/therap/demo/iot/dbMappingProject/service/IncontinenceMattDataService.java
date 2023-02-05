package net.therap.demo.iot.dbMappingProject.service;

import net.therap.demo.iot.dbMappingProject.model.data.IncontinenceMattData;
import net.therap.demo.iot.dbMappingProject.repo.IncontinenceMattRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncontinenceMattDataService {

    @Autowired
    private IncontinenceMattRepo incontinenceMattRepo;

    public void save(IncontinenceMattData incontinenceMattData) {
        incontinenceMattRepo.save(incontinenceMattData);
    }
}
