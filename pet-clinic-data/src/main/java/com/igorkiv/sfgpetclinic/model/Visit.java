package com.igorkiv.sfgpetclinic.model;

import sun.util.resources.LocaleData;

public class Visit extends BaseEntity{
    private LocaleData data;
    private String description;
    private Pet pet;

    public LocaleData getData() {
        return data;
    }

    public void setData(LocaleData data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
