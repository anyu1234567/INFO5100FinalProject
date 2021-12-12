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
public class Voluntary {
    private int vid;
    private String vname;
    private String pw;
    private int is_individual;
    private String city;
    private String email;

    public Voluntary(int vid, String vname, String pw, int is_individual, String city, String email) {
        this.vid = vid;
        this.vname = vname;
        this.pw = pw;
        this.is_individual = is_individual;
        this.city = city;
        this.email = email;
    }
   

   
    
    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public int getIs_individual() {
        return is_individual;
    }

    public void setIs_individual(int is_individual) {
        this.is_individual = is_individual;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 查询可以注册的disaster
     * @return 
     */
    public  ArrayList<Disaster> queryDisaster(){
        try {
            Data instance = Data.getInstance();
            ResultSet rs = instance.queryDisaster();
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
    /**
     * 通过disaster id 选择disaster
     * @param disaster_id
     * @return 
     */
    public boolean chooseDisaster(int disaster_id){
        Data instance = Data.getInstance();
        return instance.insert(disaster_id,this);
        
    }
    /**
     * 注册voluntary—— 将类中的信息增加到数据库中
     * @return 
     */
    public boolean registerVol(){
        Data instance = Data.getInstance();
        return instance.insert(this);
    }
    public boolean login(){
        try {
            Data instance = Data.getInstance();
            ResultSet rs= instance.queryVol(this);
            while(rs.next()){
               
               this.vid = rs.getInt("vid");
               this.is_individual = rs.getInt("is_individual");
               this.city = rs.getString("city");
               this.email = rs.getString("email");
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
        return instance.updateVol(this);
    }
    public boolean create(){
        Data instance = Data.getInstance();
        return instance.insert(this);
    }
}
