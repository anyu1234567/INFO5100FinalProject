/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu5100.finalproject.model;

import com.neu5100.finalproject.data.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author An
 */

public class Receiver {
    private int receiver_id;
    private String receiver_name;
    private String receiver_pw;
    //0123 po , fire, hos , am
    private int role;

    @Override
    public String toString() {
        return ""+receiver_id;
    }
    
    public Receiver(int receiver_id, String receiver_name, String receiver_pw, int role) {
        this.receiver_id = receiver_id;
        this.receiver_name = receiver_name;
        this.receiver_pw = receiver_pw;
        this.role = role;
    }

    public Receiver(String receiver_name, String receiver_pw, int role) {
        this.receiver_name = receiver_name;
        this.receiver_pw = receiver_pw;
        this.role = role;
    }

    
    
    public int getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(int receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_pw() {
        return receiver_pw;
    }

    public void setReceiver_pw(String receiver_pw) {
        this.receiver_pw = receiver_pw;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    /**
     * 通过自身receiver id 查询 分配到的request
     * @return 
     */
    public ArrayList<AssignWorkRequest> queryAssignedRequest(){
        try {
            Data instance = Data.getInstance();
            ResultSet rs = instance.queryRequest(this.receiver_id);
            //assign_id ,emergency_id ,need_police,need_hospital,need_fireman,`status`,vol_number,disaster_id
            ArrayList<AssignWorkRequest> array = new ArrayList<>();
            while(rs.next()){
                int assign_id = rs.getInt("assign_id");
                int emergency_id = rs.getInt("emergency_id");
                int need_police = rs.getInt("need_police");
                int need_hospital = rs.getInt("need_hospital");
                int need_fireman = rs.getInt("need_fireman");
                int status = rs.getInt("status");
                int vol_number = rs.getInt("vol_number");
                int disaster_id = rs.getInt("disaster_id");
                AssignWorkRequest assignWorkRequest =new AssignWorkRequest(assign_id, emergency_id, need_police, need_hospital, need_fireman, status, vol_number, disaster_id);
                array.add(assignWorkRequest);
            }
            return array;
        } catch (SQLException ex) {
            Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
         public boolean login(){
        try {
            Data instance = Data.getInstance();
            ResultSet rs= instance.queryRec(this);
            while(rs.next()){
                int role = rs.getInt("role");
                if(role!=this.role) break;
                this.receiver_id= rs.getInt("receiver_id");
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(OrganizationAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean update(){
        Data instance = Data.getInstance();
        return instance.updateRec(this);
    }

    public Emergency queryEmergency(int emergency_id) {
        try {
            Data instance = Data.getInstance();
            ResultSet rs = instance.queryEmergency(emergency_id);
            while(rs.next()){
                int eid = rs.getInt("eid");
                String ename = rs.getString("ename");
                int popid = rs.getInt("popid");
                String situation = rs.getString("situation");
                String time = rs.getString("time");
                int status = rs.getInt("zipcode");
                int vol_number = rs.getInt("opsid");
                Emergency e  = new Emergency(eid, ename, popid, situation, time, popid, popid);
                return e; 
            }
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    


}
