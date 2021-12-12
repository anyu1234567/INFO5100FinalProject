/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu5100.finalproject.model;

import com.neu5100.finalproject.data.Data;

/**
 *
 * @author An
 */
public class Disaster {
    private int disaster_id ;
    private String disaster_name;
    private int disaster_level;
    private int allowed_voluntary;
    private int max_voluntary;

    @Override
    public String toString() {
        return ""+ disaster_id;
    }

    public Disaster(int disaster_id, String disaster_name, int disaster_level, int allowed_voluntary, int max_voluntary) {
        this.disaster_id = disaster_id;
        this.disaster_name = disaster_name;
        this.disaster_level = disaster_level;
        this.allowed_voluntary = allowed_voluntary;
        this.max_voluntary = max_voluntary;
    }
    

    public int getDisaster_id() {
        return disaster_id;
    }

    public void setDisaster_id(int disaster_id) {
        this.disaster_id = disaster_id;
    }

    public String getDisaster_name() {
        return disaster_name;
    }

    public void setDisaster_name(String disaster_name) {
        this.disaster_name = disaster_name;
    }

    public int getDisaster_level() {
        return disaster_level;
    }

    public void setDisaster_level(int disaster_level) {
        this.disaster_level = disaster_level;
    }

    public int getAllowed_voluntary() {
        return allowed_voluntary;
    }

    public void setAllowed_voluntary(int allowed_voluntary) {
        this.allowed_voluntary = allowed_voluntary;
    }

    public int getMax_voluntary() {
        return max_voluntary;
    }

    public void setMax_voluntary(int max_voluntary) {
        this.max_voluntary = max_voluntary;
    }
    
     public boolean update(){
        Data instance = Data.getInstance();
        return  instance.updateDisaster(this);
    }
}
