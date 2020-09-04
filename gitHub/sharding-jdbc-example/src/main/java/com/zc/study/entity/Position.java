package com.zc.study.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "position")
public class Position implements Serializable {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @Column(name ="name")
    private String name;

    @Column(name ="salary")
    private String salsay;

    @Column(name ="city")
    private String city;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalsay() {
        return salsay;
    }

    public void setSalsay(String salsay) {
        this.salsay = salsay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
