package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;


@Entity
public class Skill extends AbstractEntity {


    private String longDescription;

    public Skill () {
    }

    public Skill (String longDescription) {
        super();
        this.longDescription = longDescription;
    }


    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}