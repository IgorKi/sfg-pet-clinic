package com.igorkiv.sfgpetclinic.services.map;

import com.igorkiv.sfgpetclinic.model.PerType;
import com.igorkiv.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PerType, Long> implements PetTypeService {
    @Override
    public Set<PerType> findAll() {
        return super.findAll();
    }

    @Override
    public PerType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PerType save(PerType object) {
        return super.save(object);
    }

    @Override
    public void delete(PerType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
