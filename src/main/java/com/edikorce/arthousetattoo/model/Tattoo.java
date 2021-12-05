package com.edikorce.arthousetattoo.model;

import javax.persistence.*;

@Entity
@Table(name = "tattoo_table")
public class Tattoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(nullable = false, unique = true, length = 25)
    private String name;

    @Column(nullable = false, unique = true)
    private String picturePath;

    private String madhesia;

    public Tattoo(String name, String picturePath, String madhesia) {
        this.name = name;
        this.picturePath = picturePath;
        this.madhesia = madhesia;

    }

    public Tattoo() {
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

    public String getMadhesia() {
        return madhesia;
    }

    public void setMadhesia(String madhesia) {
        this.madhesia = madhesia;
    }
}
