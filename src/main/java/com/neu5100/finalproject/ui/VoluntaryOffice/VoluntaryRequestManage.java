/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu5100.finalproject.ui.VoluntaryOffice;

import com.neu5100.finalproject.model.AssignWorkRequest;
import com.neu5100.finalproject.model.Disaster;
import com.neu5100.finalproject.model.OrganizationAdmin;
import com.neu5100.finalproject.model.Receiver;
import com.neu5100.finalproject.model.Voluntary;
import com.neu5100.finalproject.ui.FiremanOffice.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class VoluntaryRequestManage extends javax.swing.JPanel {
    JPanel userProcessContainer;
    OrganizationAdmin admin;
    /**
     * Creates new form PoliceAdmin
     */
    public VoluntaryRequestManage(JPanel userProcessContainer, OrganizationAdmin admin) {
        initComponents();
        this.userProcessContainer =userProcessContainer;
        this.admin = admin;
        refreshDi();
        refreshVol();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDisaster = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblreques = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblVol = new javax.swing.JTable();

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("??????", 0, 24)); // NOI18N
        jLabel2.setText("Manage Voluntary Request");

        btnAccept.setText("Accept Request");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign Request");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnReject.setText("Reject Request");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jLabel6.setText("Voluntary:");

        tblDisaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "level", "allowed vol", "max voluntary"
            }
        ));
        jScrollPane2.setViewportView(tblDisaster);

        tblreques.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "assign_id", "emergency ID", "need_police", "need_hospital", "need_fireman", "status", "disaster_id"
            }
        ));
        jScrollPane3.setViewportView(tblreques);

        jButton1.setText("view request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblVol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "vol id"
            }
        ));
        jScrollPane4.setViewportView(tblVol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(79, 79, 79)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnReject)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnAssign)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this); 
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = tblDisaster.getSelectedRow();
        if ( selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row first.");
            return;
        } 
        
         Disaster d = (Disaster)tblDisaster.getValueAt(selectedRowIndex, 0);
         refreshWR(d.getDisaster_id());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblreques.getSelectedRow();
        if ( selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a request row first.");
            return;
        } 
        
         AssignWorkRequest awr = (AssignWorkRequest)tblreques.getValueAt(selectedRowIndex, 0);
         awr.setSatus(1);
         awr.update();
         JOptionPane.showMessageDialog(this, "request accepted");
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblreques.getSelectedRow();
        if ( selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a request row first.");
            return;
        } 
        
         AssignWorkRequest awr = (AssignWorkRequest)tblreques.getValueAt(selectedRowIndex, 0);
         awr.setSatus(5);
         awr.update();
         JOptionPane.showMessageDialog(this, "request rejected");
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
       int row = tblDisaster.getSelectedRow();
        if ( row < 0){
            JOptionPane.showMessageDialog(this, "Please select a disaster row first.");
            return;
        } 
        
         Disaster d = (Disaster)tblDisaster.getValueAt(row, 0);
        
        
        
        int selectedRowIndex = tblVol.getSelectedRow();
        if ( selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a voluntary row first.");
            return;
        } 
        
         Voluntary vol = (Voluntary)tblVol.getValueAt(selectedRowIndex, 0);
         admin.chooseDisaster(d.getDisaster_id(), vol);
         JOptionPane.showMessageDialog(this, "assign disaster success");
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblDisaster;
    private javax.swing.JTable tblVol;
    private javax.swing.JTable tblreques;
    // End of variables declaration//GEN-END:variables

    public void refreshWR(int disasterid) {
        int rowCount = tblreques.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblreques.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        
        for (AssignWorkRequest awr:admin.queryRecquestByDisaster(disasterid)) {
                
               Object row[] = new Object[7];
                row[0] = awr;
                row[1] = awr.getEmergency_id();
                row[2] = awr.getNeed_police();
                row[3] = awr.getNeed_hospital();
                row[4] = awr.getNeed_firman();
                row[5] = awr.getSatus();
                row[6] = awr.getDisaster_id();
                model.addRow(row);

        }
    }

    public void refreshDi() {
        int rowCount = tblDisaster.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblDisaster.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        
        for (Disaster d:admin.queryAllowedDisaster()) {
                
               Object row[] = new Object[5];
                row[0] = d;
                row[1] = d.getDisaster_name();
                row[2] = d.getDisaster_level();
                row[3] = d.getAllowed_voluntary();
                row[4] = d.getMax_voluntary();
                model.addRow(row);
           
            
            
        }
    }
    public void refreshVol(){
        int rowCount = tblVol.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblVol.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        
        for (Voluntary vol:admin.queryAllVol()) {
                
               Object row[] = new Object[7];
                row[0] = vol;
                model.addRow(row);

        }
    }
}
