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
public class IncidentOps {
    private int ops_id;
    private String ops_name;
    private String ops_pw;
    // role :  911, lifeline ,disaster org 0,1,2
    private int role;

    public IncidentOps(String ops_name, String ops_pw, int role) {
        this.ops_name = ops_name;
        this.ops_pw = ops_pw;
        this.role = role;
    }

   
    
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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
    public boolean createEmergency(Emergency e){
        Data instance = Data.getInstance();
        return instance.insert(e);
        
    }
     public boolean createPopulation(Population p){
        Data instance = Data.getInstance();
        return instance.insert(p);
        
    }
     /**
      * 创建事件
      * @param wr
      * @return 
      */
    
    public boolean createAssignEmergencyWorkRequest(AssignWorkRequest wr) {
        Data instance = Data.getInstance();
        return instance.insert(wr);
    }
    /**
     * 创建需要关联到事件的disaster
     * @param d
     * @return 
     */
    
    public boolean createDisaster(Disaster d){
        Data instance = Data.getInstance();
        return instance.insert(d);
    }
    public boolean login(){
        try {
            Data instance = Data.getInstance();
            ResultSet rs = instance.queryOps(this);
            while(rs.next()){
               if(this.role != rs.getInt("role")){
                   System.out.println("the role is not correct");
                   return false;
               } 
               this.setOps_id(rs.getInt("ops_id"));
               
               return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(IncidentOps.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    public boolean update(){
         Data instance = Data.getInstance();
        return  instance.updateIncident(this);
    }
    public  ArrayList<Disaster> queryDisaster(){
        try {
            Data instance = Data.getInstance();
            ResultSet rs = instance.queryAllDisaster();
            ArrayList<Disaster> array = new ArrayList<>();
            //
            while(rs.next()){
                int id = rs.getInt("disaster_id");
                String name = rs.getString("disaster_name");
                int disaster_level= rs.getInt("disaster_level");
                int allowed_voluntary = rs.getInt("allowed_voluntary");
                int max_voluntary = rs.getInt("max_voluntary");
                Disaster d = new Disaster(id, name, disaster_level, allowed_voluntary, max_voluntary);
                array.add(d);
            }
            return array;
        } catch (SQLException ex) {
            Logger.getLogger(Voluntary.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
