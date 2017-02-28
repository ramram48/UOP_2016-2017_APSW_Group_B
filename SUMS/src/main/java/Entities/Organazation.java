/**
 * This file was generated by the JPA Modeler
 */
package Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author a
 */
@Entity
public class Organazation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String PostCode;

    @Basic
    private String Name;

    @Basic
    private String Number;

    @Basic
    private String PostalAddress;

    @Basic
    private String ActivityDescription;

    @OneToMany(targetEntity = Project.class)
    private List<Project> projects;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostCode() {
        return this.PostCode;
    }

    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNumber() {
        return this.Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getPostalAddress() {
        return this.PostalAddress;
    }

    public void setPostalAddress(String PostalAddress) {
        this.PostalAddress = PostalAddress;
    }

    public String getActivityDescription() {
        return this.ActivityDescription;
    }

    public void setActivityDescription(String ActivityDescription) {
        this.ActivityDescription = ActivityDescription;
    }

    public List<Project> getProjects() {
        return this.projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

}