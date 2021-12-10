/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu5100.finalproject.data;

import com.neu5100.finalproject.model.AssignWorkRequest;
import com.neu5100.finalproject.model.Disaster;
import com.neu5100.finalproject.model.Emergency;
import com.neu5100.finalproject.model.IncidentOps;
import com.neu5100.finalproject.model.OrganizationAdmin;
import com.neu5100.finalproject.model.Population;
import com.neu5100.finalproject.model.Receiver;
import com.neu5100.finalproject.model.Voluntary;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author An
 */
public class Data {
    static final String USER = "root";
    static final String PASS = "123456";
    static final String URL = "jdbc:mysql://127.0.0.1:3306/ecosystem";
    static  Connection conn =null;
    private static Data manager = null;
    
    public Data() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.conn = DriverManager.getConnection(URL,USER,PASS); 
    }
    public static Data getInstance() {  
    if (manager == null) {  
        try {
            manager= new Data();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }  
    return manager;  
    }
    public  boolean insert(IncidentOps opser){
        StringBuilder sb   = new StringBuilder();
        sb.append("insert into 911ops values ( ?,?,?)");
       
        try {
            PreparedStatement stmt = conn.prepareStatement(sb.toString());
            stmt.setInt(1, opser.getOps_id());
            stmt.setString(2, opser.getOps_name());
            stmt.setString(3, opser.getOps_pw());
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    public boolean delete(IncidentOps opser) {
        try {
            String sql = "DELETE FROM 911ops WHERE ops_id = ?";
            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setInt(1, opser.getOps_id());
            
            return prepareStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update(IncidentOps opser){
        try{
            String sql  = "UPDATE 911ops SET ops_name= ?, ops_pw=? where ops_id = ?";
            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setString(1, opser.getOps_name());
            prepareStatement.setString(2, opser.getOps_pw());
            prepareStatement.setInt(3, opser.getOps_id());
            return prepareStatement.execute();
        }catch(Exception ex){
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public IncidentOps select(int opsId){
        try{
            String sql  = "select * from 911ops where ops_id = ?";
            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setInt(1, opsId);
            ResultSet executeQuery = prepareStatement.executeQuery();
            String name=null;
            String pw=null;
            while(executeQuery.next()){
                name = executeQuery.getString(2);
                pw =  executeQuery.getString(3);
             
            }
            IncidentOps ops = new IncidentOps(opsId, name, pw);
            return ops;
        }catch(Exception ex){
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    public ResultSet selectAll(String tableName){
        try{
            String sql  = "select * from "+tableName;
            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            ResultSet executeQuery = prepareStatement.executeQuery();
           return executeQuery;
        }catch(Exception ex){
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    public boolean insert(Emergency e) {
        String sql = "insert into emergency values ( ?,?,?,?,?,?,?)";
       
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, e.getEid());
            stmt.setString(2, e.getEname());
            stmt.setInt(3, e.getPopid());
            stmt.setString(4, e.getSituation());
            stmt.setString(5, e.getTime());
            stmt.setInt(6, e.getZipcode());
            stmt.setInt(7, e.getOpsid());
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
        
       
    }

    public boolean insert(Population p) {
        String sql = "insert into population values ( ?,?,?,?,?)";
       
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, p.getPop_id());
            stmt.setString(2, p.getPop_name());
            stmt.setInt(3, p.getPop_age());
            stmt.setInt(4, p.getPop_gender());
            stmt.setString(5, p.getPop_phone());
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }

    public boolean insert(AssignWorkRequest wr) {
       
        String  sql = "insert into assign_emergency_request (assign_id,emergency_id,need_police,need_hospital,need_fireman,status,vol_number,disaster_id) values (?,?,?,?,?,?,?,?)";
       
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, wr.getAssign_id());
            stmt.setInt(2, wr.getEmergency_id());
            stmt.setInt(3, wr.getNeed_police());
            stmt.setInt(4, wr.getNeed_hospital());
            stmt.setInt(5, wr.getNeed_firman());
            stmt.setInt(6, wr.getSatus());
            stmt.setInt(7, wr.getVol_number());
            stmt.setInt(8, wr.getDisaster_id());        
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }

    public ResultSet selectForPolice() {
        try{
            String sql  = "select * from assign_emergency_request where need_police = 1 ";
            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            ResultSet executeQuery = prepareStatement.executeQuery();
           return executeQuery;
        }catch(Exception ex){
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ResultSet selectForHospital() {
        try{
            String sql  = "select * from assign_emergency_request where need_hospital = 1 ";
            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            ResultSet executeQuery = prepareStatement.executeQuery();
           return executeQuery;
        }catch(Exception ex){
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ResultSet selectForFireman() {
        try{
            String sql  = "select * from assign_emergency_request where need_fireman = 1 ";
            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            ResultSet executeQuery = prepareStatement.executeQuery();
           return executeQuery;
        }catch(SQLException ex){
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean insert(int request_id, int receiver_id) {
        String sql = "insert into requests_receiver values (0,?,?)";
       
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, request_id);
            stmt.setInt(2, receiver_id);
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
    public boolean insert(int disaster_id,Voluntary v) {
        String sql = "insert into disaster_vol values (0,?,?)";
       
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, disaster_id);
            stmt.setInt(2,v.getVid());
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }

    public ResultSet queryRequest(int receiver_id) {
        String  sql ="SELECT assign_id ,emergency_id ,need_police,need_hospital,need_fireman,`status`,vol_number,disaster_id FROM assign_emergency_request,requests_receiver where assign_id=request_id and receiver_id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, receiver_id);
            ResultSet executeQuery = stmt.executeQuery();
            return executeQuery;
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
    }

    public ResultSet queryReceiver(int request_id) {
        String  sql ="SELECT receiver_info.receiver_id,receiver_name,receiver_pw,role FROM receiver_info,requests_receiver where receiver_info.receiver_id = requests_receiver.receiver_id and request_id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, request_id);
            ResultSet executeQuery = stmt.executeQuery();
            return executeQuery;
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
    }

    public ResultSet queryDisaster() {
        String sql = "select * disaster from where allowed_voluntary != 0";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet executeQuery = stmt.executeQuery();
            return executeQuery;
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
    }

    public ResultSet queryVolByDisaster(int disaster_id) {
        String sql = "SELECT vid,vname,vol_pw,is_individual,city,email FROM ecosystem.voluntary,disaster_vol where disaster_id= ? and voluntary.vid= disaster_vol.voluntary_id";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, disaster_id);
            ResultSet rs = stmt.executeQuery();    
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
    }

    public boolean insert(Disaster d) {
       String sql = "insert into disaster values(?,?,?,?,?)";
       try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, d.getDisaster_id());
            stmt.setString(2, d.getDisaster_name());
            stmt.setInt(3, d.getDisaster_level());
            stmt.setInt(4, d.getAllowed_voluntary());
            stmt.setInt(5, d.getMax_voluntary());
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }

    public ResultSet queryOps(IncidentOps ops) {
        String sql = "SELECT * FROM ecosystem.911ops where ops_name= ? and ops_pw = ?";
       try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ops.getOps_name());
            stmt.setString(2, ops.getOps_pw());
            return stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
    }

    public ResultSet queryAdmin(OrganizationAdmin admin) {
        String sql = "SELECT * FROM ecosystem.org_admin where admin_name= ? and admin_pw = ?";
       try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, admin.getAdmin_name());
            stmt.setString(2, admin.getAdmin_pw());
            return stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
    }

    public ResultSet queryRec(Receiver receiver) {
       String sql = "SELECT * FROM ecosystem.receiver_info where receiver_name= ? and receiver_pw = ?";
       try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, receiver.getReceiver_name());
            stmt.setString(2, receiver.getReceiver_pw());
            return stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
    }

    public boolean insert(Voluntary vol) {
        String sql = "insert into voluntary values(?,?,?,?,?,?)";
       try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, vol.getVid());
            stmt.setString(2, vol.getVname());
            stmt.setString(3, vol.getPw());
            stmt.setInt(4, vol.getIs_individual());
            stmt.setString(5, vol.getCity());
            stmt.setString(6, vol.getEmail());
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }

    public ResultSet queryVol(Voluntary vol) {
        String sql = "SELECT * FROM ecosystem.voluntary where vname= ? and vol_pw = ?";
       try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,vol.getVname() );
            stmt.setString(2, vol.getPw());
            return stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
    }
}
