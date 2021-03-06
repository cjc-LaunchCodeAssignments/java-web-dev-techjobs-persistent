package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;


@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs;

    private String description;

    public Skill () {
    }

    public Skill (String description) {
        super();
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String longDescription) {
        this.description = longDescription;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}