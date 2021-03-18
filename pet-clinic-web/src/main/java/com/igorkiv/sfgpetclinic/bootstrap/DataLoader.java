package com.igorkiv.sfgpetclinic.bootstrap;

import com.igorkiv.sfgpetclinic.model.Owner;
import com.igorkiv.sfgpetclinic.model.PerType;
import com.igorkiv.sfgpetclinic.model.Vet;
import com.igorkiv.sfgpetclinic.services.OwnerService;
import com.igorkiv.sfgpetclinic.services.PetTypeService;
import com.igorkiv.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PerType dog = new PerType();
        dog.setName("Dog");
        PerType saveDogPetType = petTypeService.save(dog);

        PerType cat = new PerType();
        cat.setName("Cat");
        PerType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Mihael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
