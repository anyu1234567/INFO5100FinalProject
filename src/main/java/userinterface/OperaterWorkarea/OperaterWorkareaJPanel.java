/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OperaterWorkarea;

import com.neu5100.finalproject.model.AssignWorkRequest;
import com.neu5100.finalproject.model.Emergency;
import com.neu5100.finalproject.model.IncidentOps;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SuicideWorkarea.SuicideWorkareaJPanel;

/**
 *
 * @author chenghongmei
 */
public class OperaterWorkareaJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
     private IncidentOps ops;
    /**
     * Creates new form OperaterWorkareaJPanel
     */
    public OperaterWorkareaJPanel(JPanel userProcessContainer ,IncidentOps incidentOps ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ops = incidentOps;
        refreshEmergency();
        refreshWorkRequest();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnProcess1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        EventTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        create = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblreques = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("911 OPERATOR WORK AREA");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnProcess1.setText("Process");
        btnProcess1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcess1ActionPerformed(evt);
            }
        });

        EventTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "emergency ID", "ename", "pop id", "situation", "time", "zipcode", "opsid"
            }
        ));
        jScrollPane2.setViewportView(EventTable1);

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel Request");

        create.setText("create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(btnProcess1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess1)
                    .addComponent(btnView)
                    .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcess1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcess1ActionPerformed
        // TODO add your handling code here:
        
       int row = EventTable1.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Emergency e = (Emergency)EventTable1.getValueAt(row, 0);   
        
        
        
        
     ProcessJPanel processJPanel = new ProcessJPanel(userProcessContainer,e, ops, 0);
     userProcessContainer.add(processJPanel);
     CardLayout layout = (CardLayout)userProcessContainer.getLayout();
     layout.next(userProcessContainer);
           
        
    }//GEN-LAST:event_btnProcess1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
    int row = EventTable1.getSelectedRow();
    if ( row < 0){
        JOptionPane.showMessageDialog(this, "Please select an row first.");
        return;
    }       
        
       Emergency e = (Emergency)EventTable1.getValueAt(row, 0);
        
        ViewEventJPanel viewEventJPanel = new ViewEventJPanel(userProcessContainer,e);
        userProcessContainer.add("ViewEventJPanel",viewEventJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        refreshEmergency();
        refreshWorkRequest();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
        AddEmergencyJpanel cejp = new AddEmergencyJpanel(userProcessContainer,this.ops);
        userProcessContainer.add(cejp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createActionPerformed

    
     public void refreshEmergency(){
            int rowCount = EventTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) EventTable1.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        
        for (Emergency e:ops.queryEmergency()) {
                
               Object row[] = new Object[7];
                row[0] = e;
                row[1] = e.getEname();
                row[2] = e.getPopid();
                row[3] = e.getSituation();
                row[4] = e.getTime();
                row[5] = e.getZipcode();
                row[6] = e.getOpsid();
                model.addRow(row);
           
            
            
        }
     }
      public void refreshWorkRequest(){
            int rowCount = tblreques.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblreques.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        
        for (AssignWorkRequest awr:ops.queryWorkRequestByRole()) {
                
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EventTable1;
    private javax.swing.JButton btnProcess1;
    private javax.swing.JButton btnView;
    private javax.swing.JButton create;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblreques;
    // End of variables declaration//GEN-END:variables


}
