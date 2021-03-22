package com.igorkiv.sfgpetclinic.repositories;

import com.igorkiv.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
