package com.igorkiv.sfgpetclinic.services;

import com.igorkiv.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>
{

    Owner findByLastName(String lastName);

}
