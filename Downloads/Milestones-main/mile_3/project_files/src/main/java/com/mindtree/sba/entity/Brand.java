package com.mindtree.sba.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Brand {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mobile> mobiles = new ArrayList<>();

    public Brand() {

    }

    public Brand(Long id, String name, List<Mobile> mobiles) {
        this.id = id;
        this.name = name;
        this.mobiles = mobiles;
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

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }
}
