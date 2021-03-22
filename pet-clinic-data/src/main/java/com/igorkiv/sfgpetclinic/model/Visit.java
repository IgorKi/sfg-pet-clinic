package com.igorkiv.sfgpetclinic.model;

import sun.util.resources.LocaleData;

import javax.persistence.*;

@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

    @Column(name = "date")
    private LocaleData date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public LocaleData getDate() {
        return date;
    }

    public void setDate(LocaleData data) {
        this.date = data;
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
