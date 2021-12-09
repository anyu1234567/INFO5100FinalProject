/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu5100.finalproject.model;

/**
 *
 * @author An
 */

public class AssignWorkRequest {
    private int assign_id;
    private int emergency_id;
    private int receiver_request;
    private int need_police;
    private int need_hospital;
    private int need_firman;
    private int satus;
    private int vol_number;
    private int disaster_id;

    @Override
    public String toString() {
        return "AssignWorkRequest{" + "assign_id=" + assign_id + ", emergency_id=" + emergency_id + ", receiver_request=" + receiver_request + ", need_police=" + need_police + ", need_hospital=" + need_hospital + ", need_firman=" + need_firman + ", satus=" + satus + ", vol_number=" + vol_number + ", disaster_id=" + disaster_id + '}';
    }

    public AssignWorkRequest(int assign_id, int emergency_id, int need_police, int need_hospital, int need_firman, int satus, int vol_number ,int disaster) {
        this.assign_id = assign_id;
        this.emergency_id = emergency_id;
        this.need_police = need_police;
        this.need_hospital = need_hospital;
        this.need_firman = need_firman;
        this.satus = satus;
        this.vol_number = vol_number;
        this.disaster_id= disaster;
    }

    public int getAssign_id() {
        return assign_id;
    }

    public void setAssign_id(int assign_id) {
        this.assign_id = assign_id;
    }

    public int getEmergency_id() {
        return emergency_id;
    }

    public void setEmergency_id(int emergency_id) {
        this.emergency_id = emergency_id;
    }

    public int getReceiver_request() {
        return receiver_request;
    }

    public void setReceiver_request(int receiver_request) {
        this.receiver_request = receiver_request;
    }

    public int getNeed_police() {
        return need_police;
    }

    public void setNeed_police(int need_police) {
        this.need_police = need_police;
    }

    public int getNeed_hospital() {
        return need_hospital;
    }

    public void setNeed_hospital(int need_hospital) {
        this.need_hospital = need_hospital;
    }

    public int getNeed_firman() {
        return need_firman;
    }

    public void setNeed_firman(int need_firman) {
        this.need_firman = need_firman;
    }

    public int getSatus() {
        return satus;
    }

    public void setSatus(int satus) {
        this.satus = satus;
    }

    public int getVol_number() {
        return vol_number;
    }

    public void setVol_number(int vol_number) {
        this.vol_number = vol_number;
    }

    public int getDisaster_id() {
        return disaster_id;
    }

    public void setDisaster_id(int disaster_id) {
        this.disaster_id = disaster_id;
    }

    public boolean isDisaster() {
        if(this.disaster_id<=0){
            return false;
        }
        return true;
    }
    
}
