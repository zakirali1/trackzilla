package com.zak.trackzilla.model;

import jakarta.persistence.*;


@Entity
public class Application {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "app_id")
    private Integer id;

    @Column(name = "app_name", nullable = false)
    private String name;

    @Column(name = "app_description", nullable = false)
    private String description;

    @Column(name = "app_owner", nullable = false)
    private String owner;

    public Application() {
    }

    public Application(String name, String owner, String description) {
        this.name = name;
        this.owner = owner;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Application: id= " + id + "\n" + 
         "name = " + name + "\n" + 
         "owner = " + owner + "\n" + 
         "description = " + description + "\" ";
    }
}
