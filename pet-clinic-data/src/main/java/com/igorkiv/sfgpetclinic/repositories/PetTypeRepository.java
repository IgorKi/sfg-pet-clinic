package com.igorkiv.sfgpetclinic.repositories;

import com.igorkiv.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
