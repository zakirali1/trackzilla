package com.zak.trackzilla.respository;
import org.springframework.data.repository.CrudRepository;

import com.zak.trackzilla.model.Release;

public interface ReleaseRepository extends CrudRepository<Release, Integer> {

}
