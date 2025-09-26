package com.zak.trackzilla.respository;

import org.springframework.data.repository.CrudRepository;

import com.zak.trackzilla.model.Application;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {

}
