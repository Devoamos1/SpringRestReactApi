package com.wiredbrain.friends.model;

import javax.persistence.Entity;

@Entity
public class Child extends AbstractHouseholdMember {

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



}
