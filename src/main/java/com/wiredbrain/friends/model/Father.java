package com.wiredbrain.friends.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Father extends AbstractHouseholdMember {
    public List<Chores> getChores() {
        return chores;
    }

    public void setChores(List<Chores> chores) {
        this.chores = chores;
    }

    @OneToMany(cascade = CascadeType.ALL)
    List<Chores> chores;


}
