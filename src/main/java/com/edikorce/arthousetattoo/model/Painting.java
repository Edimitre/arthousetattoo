package com.edikorce.arthousetattoo.model;

import javax.persistence.*;

@Entity
@Table(name="paintings_table")
public class Painting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true, length = 25)
    private String name;

    @Column(nullable = false, unique = true)
    private String picturePath;

    private String weight;

    private String height;

    public Painting() {
    }

    public Painting(String name, String picturePath, String weight, String height) {
        this.name = name;
        this.picturePath = picturePath;
        this.weight = weight;
        this.height = height;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
