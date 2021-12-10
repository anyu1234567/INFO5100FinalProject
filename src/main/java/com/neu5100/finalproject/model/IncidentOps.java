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
public class IncidentOps {
    private int ops_id;
    private String ops_name;
    private String ops_pw;

    public IncidentOps(int ops_id, String ops_name, String ops_pw) {
        this.ops_id = ops_id;
        this.ops_name = ops_name;
        this.ops_pw = ops_pw;
    }

    public int getOps_id() {
        return ops_id;
    }

    public void setOps_id(int ops_id) {
        this.ops_id = ops_id;
    }

    public String getOps_name() {
        return ops_name;
    }

    public void setOps_name(String ops_name) {
        this.ops_name = ops_name;
    }

    public String getOps_pw() {
        return ops_pw;
    }

    public void setOps_pw(String ops_pw) {
        this.ops_pw = ops_pw;
    }
    
    public boolean createEmergency(Emergency e){
        Data instance = Data.getInstance();
        return instance.insert(e);
        
    }
     public boolean createPopulation(Population p){
        Data instance = Data.getInstance();
        return instance.insert(p);
        
    }

    public boolean createAssignEmergencyWorkRequest(AssignWorkRequest wr) {
        Data instance = Data.getInstance();
        return instance.insert(wr);
    }
    public boolean createDisaster(Disaster d){
        Data instance = Data.getInstance();
        return instance.insert(d);
    }
}
