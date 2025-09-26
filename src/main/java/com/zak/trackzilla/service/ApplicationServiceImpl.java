package com.zak.trackzilla.service;

import com.zak.trackzilla.model.Application;
import com.zak.trackzilla.respository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Iterable<Application> listAllApplications() {
        // TODO Auto-generated method stub
        return applicationRepository.findAll();
    }

}
