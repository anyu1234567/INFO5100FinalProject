/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemadminWorkarea;

import com.neu5100.finalproject.model.Disaster;
import com.neu5100.finalproject.model.Emergency;
import com.neu5100.finalproject.model.OrganizationAdmin;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import userinterface.OperaterWorkarea.AddEmergencyJpanel;
import userinterface.OperaterWorkarea.ProcessJPanel;

/**
 *
 * @author chenghongmei
 */
public class SystemadminWorkareaJpanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private OrganizationAdmin org;
    /**
     * Creates new form NewJPanel
     */
    public SystemadminWorkareaJpanel(JPanel userProcessContainer, OrganizationAdmin org) {
        initComponents();
        this.userProcessContainer =userProcessContainer;
        this.org = org;
        refreshAdmin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblSelectedNode2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        jLabel5.setText("Selected Node:");

        lblSelectedNode2.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        lblSelectedNode2.setText("<View_selected_node>");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Admin Work Area");

        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "admin ID", "admin Name", "admin pw", "role"
            }
        ));
        jScrollPane4.setViewportView(tblAdmin);

        jButton7.setText("create");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton8.setText("delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton9.setText("view");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblSelectedNode2))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int row = tblAdmin.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrganizationAdmin ad = (OrganizationAdmin)tblAdmin.getValueAt(row, 0);

        ViewAdminJPanel vajp = new ViewAdminJPanel(userProcessContainer,ad);
        userProcessContainer.add(vajp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row = tblAdmin.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrganizationAdmin ad = (OrganizationAdmin)tblAdmin.getValueAt(row, 0);
        ad.delete();
        refreshAdmin();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddAdminJPanel cejp = new AddAdminJPanel(userProcessContainer,this.org);
        userProcessContainer.add(cejp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblSelectedNode2;
    private javax.swing.JTable tblAdmin;
    // End of variables declaration//GEN-END:variables

    public void refreshAdmin() {
        int rowCount = tblAdmin.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblAdmin.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        
        for (OrganizationAdmin ad:org.queryAllAdmin()) {
               if(ad.getRole()!=0) continue; 
               Object row[] = new Object[4];
                row[0] = ad;
                row[1] = ad.getAdmin_name();
                row[2] = ad.getAdmin_pw();
                row[3] = ad.getRole();
                model.addRow(row);
        }
         for (OrganizationAdmin ad:org.queryAllAdmin()) {
               if(ad.getRole()!=1) continue; 
               Object row[] = new Object[4];
                row[0] = ad;
                row[1] = ad.getAdmin_name();
                row[2] = ad.getAdmin_pw();
                row[3] = ad.getRole();
                model.addRow(row);
        }
          for (OrganizationAdmin ad:org.queryAllAdmin()) {
               if(ad.getRole()!=2) continue; 
               Object row[] = new Object[4];
                row[0] = ad;
                row[1] = ad.getAdmin_name();
                row[2] = ad.getAdmin_pw();
                row[3] = ad.getRole();
                model.addRow(row);
        }
           for (OrganizationAdmin ad:org.queryAllAdmin()) {
               if(ad.getRole()!=3) continue; 
               Object row[] = new Object[4];
                row[0] = ad;
                row[1] = ad.getAdmin_name();
                row[2] = ad.getAdmin_pw();
                row[3] = ad.getRole();
                model.addRow(row);
        }
    }
}
