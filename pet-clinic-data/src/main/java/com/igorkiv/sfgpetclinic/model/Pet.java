package com.igorkiv.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
    private PerType perType;
    private Owner owner;
    private LocalDate birthData;

    public PerType getPerType() {
        return perType;
    }

    public void setPerType(PerType perType) {
        this.perType = perType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthData() {
        return birthData;
    }

    public void setBirthData(LocalDate birthData) {
        this.birthData = birthData;
    }
}
