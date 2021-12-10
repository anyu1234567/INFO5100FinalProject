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
    private int role;

    public Receiver(int receiver_id, String receiver_name, String receiver_pw, int role) {
        this.receiver_id = receiver_id;
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
        
}
