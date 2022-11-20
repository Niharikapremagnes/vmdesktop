package com.mindtree.sba.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Embeddable
public class Mobile {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private float price;

    private float display;

    private float camera;

    public Mobile() {

    }

    public Mobile(Long id, String name, float price, float display, float camera) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.display = display;
        this.camera = camera;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDisplay() {
        return display;
    }

    public void setDisplay(float display) {
        this.display = display;
    }

    public float getCamera() {
        return camera;
    }

    public void setCamera(float camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", display=" + display +
                ", camera=" + camera +
                '}';
    }
}
