package com.igorkiv.sfgpetclinic.repositories;

import com.igorkiv.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
