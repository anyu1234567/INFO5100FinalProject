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
public class OrganizationAdmin {
    private int admin_id;
    private String admin_name;
    private String admin_pw;
    // role : 0 ,1,2,3  police ,hosptial fire , voluntary
    private int role;

    public OrganizationAdmin(int admin_id, String admin_name, String admin_pw, int role) {
        this.admin_id = admin_id;
        this.admin_name = admin_name;
        this.admin_pw = admin_pw;
        this.role = role;
    }

    public OrganizationAdmin(String admin_name, String admin_pw, int role) {
        this.admin_name = admin_name;
        this.admin_pw = admin_pw;
        this.role = role;
    }

    
    

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_pw() {
        return admin_pw;
    }

    public void setAdmin_pw(String admin_pw) {
        this.admin_pw = admin_pw;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    /**
     * 关联request 和receiver ，功能：给分配事件receiver
     * @param request_id
     * @param receiver_id
     * @return 
     */
    public boolean chooseRequest(int request_id,int receiver_id){
        Data instance = Data.getInstance();
        return instance.insert(request_id,receiver_id);
    }
    /**
     * 获取admin所能管理的receiver
     * @param role
     * @return 
     */
    public ArrayList<Receiver> getReceiver(){
        try {
            Data instance = Data.getInstance();
            ResultSet selectAll = instance.selectAll("receiver_info");
            ArrayList<Receiver>  arr_re = new ArrayList<>();
            while(selectAll.next()){
                if(this.role==0){
                    int id = selectAll.getInt(1);
                    String name = selectAll.getString(2);
                    String pw = selectAll.getString(3);
                    int receiver_role = selectAll.getInt(4);
                    Receiver r = new Receiver(id,name,pw,receiver_role);
                    if(receiver_role==0){
                        arr_re.add(r);                        
                    }
                }else if(this.role==1){
                    int id = selectAll.getInt(1);
                    String name = selectAll.getString(2);
                    String pw = selectAll.getString(3);
                    int receiver_role = selectAll.getInt(4);
                    Receiver r = new Receiver(id,name,pw,receiver_role);
                    if(receiver_role==1){
                        arr_re.add(r);                        
                    }
                }else if(this.role==2){
                    int id = selectAll.getInt(1);
                    String name = selectAll.getString(2);
                    String pw = selectAll.getString(3);
                    int receiver_role = selectAll.getInt(4);
                    Receiver r = new Receiver(id,name,pw,receiver_role);
                    if(receiver_role==2||receiver_role==3){
                        arr_re.add(r);                        
                    }
                }
                    
            }
            return arr_re;
        } catch (SQLException ex) {
            Logger.getLogger(OrganizationAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    /**
     * 查询对应身份权限下的事件：police admin只能看到需要警察的request
     * @return 
     */
    public ArrayList<AssignWorkRequest> queryWorkRequestByRole(){
         try {
            Data instance = Data.getInstance();
            ResultSet  selectForPolice =null;
            if(this.role==0){
                selectForPolice = instance.selectForPolice();
            }else if(this.role==1){
                selectForPolice = instance.selectForHospital();
            }else{
                selectForPolice = instance.selectForHospital();
            }
             ArrayList<AssignWorkRequest> arry = new ArrayList<>();
            while(selectForPolice.next()){
                int aid = selectForPolice.getInt("assign_id");
                int eid = selectForPolice.getInt("emergency_id");
                int need_police = selectForPolice.getInt("need_police");
                int need_hospital = selectForPolice.getInt("need_hospital");
                int need_fireman = selectForPolice.getInt("need_fireman");
                int status = selectForPolice.getInt("status");
                int vol_num = selectForPolice.getInt("vol_number");
                int disaster = selectForPolice.getInt("disaster_id");
                AssignWorkRequest awr = new AssignWorkRequest(aid, eid, need_police, need_hospital, need_fireman, status, vol_num, disaster);
                arry.add(awr);      
            }
            return arry;
        } catch (SQLException ex) {
            Logger.getLogger(OrganizationAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    /**
     * 通过request id 查询分配到此事件的receiver
     * @param request_id
     * @return 
     */
    public ArrayList<Receiver> queryReceiverByRequest(int request_id){
        try {
            Data instance = Data.getInstance();
            ResultSet rs = instance.queryReceiver(request_id);
            ArrayList<Receiver> array = new ArrayList<>();
            //receiver_info.receiver_id,receiver_name,receiver_pw,role
            while(rs.next()){
                int receiver_id = rs.getInt("receiver_id");
                String receiver_name = rs.getString("receiver_name");
                String receiver_pw = rs.getString("receiver_pw");
                int role = rs.getInt("role");
                Receiver r = new Receiver(receiver_id, receiver_name, receiver_pw, role);
                array.add(r);
            }
            return array;
        } catch (SQLException ex) {
            Logger.getLogger(OrganizationAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    /**
     * 通过disaster id 查询选择了此disaster的voluntary
     * @param disaster_id
     * @return 
     */
    public ArrayList<Voluntary> queryVolByDisaster(int disaster_id){
         try {
            Data instance = Data.getInstance();
            ResultSet rs = instance.queryVolByDisaster(disaster_id);
            ArrayList<Voluntary> array = new ArrayList<>();
            //receiver_info.receiver_id,receiver_name,receiver_pw,role
            while(rs.next()){
                int vid = rs.getInt("vid");
                String vname= rs.getString("vname");
                String vol_pw = rs.getString("vol_pw");
                int is_individual = rs.getInt("is_individual");
                String city = rs.getString("city");
                String email = rs.getString("email");
                Voluntary v = new Voluntary(vid, vname, vol_pw, is_individual, city, email);
                array.add(v);
            }
            return array;
        } catch (SQLException ex) {
            Logger.getLogger(OrganizationAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public boolean login(){
        try {
            Data instance = Data.getInstance();
            ResultSet rs= instance.queryAdmin(this);
            while(rs.next()){
                int role = rs.getInt("role");
                if(role!=this.role) break;
                this.admin_id= rs.getInt("admin_id");
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
        return instance.updateOrgAdmin(this);
    }
    
}
