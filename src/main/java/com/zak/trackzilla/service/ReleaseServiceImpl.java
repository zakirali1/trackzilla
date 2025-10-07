package com.zak.trackzilla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zak.trackzilla.model.Release;
import com.zak.trackzilla.respository.ReleaseRepository;

@Service
public class ReleaseServiceImpl implements ReleaseService {
   
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override 
    public Iterable <Release> listReleases() {
        return releaseRepository.findAll();
    }


}
