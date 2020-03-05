package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.Size;

public class Skill extends AbstractEntity {


    private String longDescription;

    Skill () {
    }

    Skill (String longDescription) {
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