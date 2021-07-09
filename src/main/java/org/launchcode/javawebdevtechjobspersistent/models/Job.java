package org.launchcode.javawebdevtechjobspersistent.models;



import javax.persistence.*;
@Entity
public class Job extends AbstractEntity{

    private String employer;
    private String skills;

    public Job() {
    }

    public Job(String Employer, String Skills) {
        super();
        this.employer = Employer;
        this.skills = Skills;
    }


    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }


}
