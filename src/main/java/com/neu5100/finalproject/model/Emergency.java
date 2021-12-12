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
public class Emergency {
    private int eid;
    private String ename;
    private int popid;
    private String situation;
    private String time;
    private  int zipcode;
    private int opsid;

    @Override
    public String toString() {
        return "" + eid ;
    }
    
    

    public Emergency(int eid, String ename, int popid, String situation, String time, int zipcode, int opsid) {
        this.eid = eid;
        this.ename = ename;
        this.popid = popid;
        this.situation = situation;
        this.time = time;
        this.zipcode = zipcode;
        this.opsid = opsid;
    }

    public int getOpsid() {
        return opsid;
    }

    public void setOpsid(int opsid) {
        this.opsid = opsid;
    }
   

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getPopid() {
        return popid;
    }

    public void setPopid(int popid) {
        this.popid = popid;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }/**
     * update emergency
     * @return 
     */
    public boolean update(){
        Data instance = Data.getInstance();
        return  instance.updateEm(this);
    }
}
